# Transcript: A new account can sign in and read itself back

| | |
|---|---|
| Test | `com.qaautomation.tests.smoke.HealthSmokeTest#newAccountCanSignInAndReadItself` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 356 | `qa-783c3310-6a8b-46da-975d-ac70904faed6` |
| 2 | `POST /v1/auth/token` | 200 | 51 | `qa-2860e1a8-4f46-418a-809e-53cb8645fce9` |
| 3 | `GET /v1/accounts/me` | 200 | 51 | `qa-89b2a6b4-c316-46cb-9f3e-7eeeabac9c45` |
| 4 | `GET /v1/accounts/me` | 200 | 15 | `qa-cf77b364-0b12-45a3-b7a3-dbd8f206a28e` |
| 5 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-4f4b15e0-3420-4230-8341-049dee7d123e` |
| 6 | `POST /v1/auth/token` | 401 | 12 | `qa-e27dd49d-bc94-4827-ba3b-a2accdf49262` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-783c3310-6a8b-46da-975d-ac70904faed6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-783c3310-6a8b-46da-975d-ac70904faed6
Content-Type: application/json

--- request body ---
{"handle":"qa-30c09f88a610","displayName":"QA 30c09f88a610","password":"****","region":"eu"}

--- response: 201 in 356 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-783c3310-6a8b-46da-975d-ac70904faed6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-30c09f88a610
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9cc1aaf1-c5c0-40e0-a112-ff0e55a19961","handle":"qa-30c09f88a610","displayName":"QA 30c09f88a610","region":"eu","role":"user","createdAt":"2026-11-12T09:56:25.265220525Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2860e1a8-4f46-418a-809e-53cb8645fce9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2860e1a8-4f46-418a-809e-53cb8645fce9
Content-Type: application/json

--- request body ---
{"handle":"qa-30c09f88a610","password":"****"}

--- response: 200 in 51 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-2860e1a8-4f46-418a-809e-53cb8645fce9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9cc1aaf1-c5c0-40e0-a112-ff0e55a19961"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-89b2a6b4-c316-46cb-9f3e-7eeeabac9c45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89b2a6b4-c316-46cb-9f3e-7eeeabac9c45
Content-Type: application/json

--- response: 200 in 51 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-89b2a6b4-c316-46cb-9f3e-7eeeabac9c45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9cc1aaf1-c5c0-40e0-a112-ff0e55a19961","handle":"qa-30c09f88a610","displayName":"QA 30c09f88a610","region":"eu","role":"user","createdAt":"2026-11-12T09:56:25.265220525Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf77b364-0b12-45a3-b7a3-dbd8f206a28e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf77b364-0b12-45a3-b7a3-dbd8f206a28e
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf77b364-0b12-45a3-b7a3-dbd8f206a28e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9cc1aaf1-c5c0-40e0-a112-ff0e55a19961","handle":"qa-30c09f88a610","displayName":"QA 30c09f88a610","region":"eu","role":"user","createdAt":"2026-11-12T09:56:25.265220525Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f4b15e0-3420-4230-8341-049dee7d123e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f4b15e0-3420-4230-8341-049dee7d123e
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f4b15e0-3420-4230-8341-049dee7d123e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e27dd49d-bc94-4827-ba3b-a2accdf49262

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e27dd49d-bc94-4827-ba3b-a2accdf49262
Content-Type: application/json

--- request body ---
{"handle":"qa-30c09f88a610","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e27dd49d-bc94-4827-ba3b-a2accdf49262
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e27dd49d-bc94-4827-ba3b-a2accdf49262"}
```
