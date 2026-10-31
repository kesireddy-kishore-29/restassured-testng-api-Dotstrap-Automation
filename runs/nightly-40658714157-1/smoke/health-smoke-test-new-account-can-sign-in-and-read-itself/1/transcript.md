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
| 1 | `POST /v1/accounts` | 201 | 418 | `qa-21e7e000-70b0-4d48-81c8-43ac6d336909` |
| 2 | `POST /v1/auth/token` | 200 | 61 | `qa-0dd505b5-3088-49ba-8b40-24156ff8edb2` |
| 3 | `GET /v1/accounts/me` | 200 | 79 | `qa-d606fe6e-d6eb-4155-9b5d-23e6e183d59a` |
| 4 | `GET /v1/accounts/me` | 200 | 26 | `qa-82058be2-ff56-4ce9-b2f9-e5cb280efc9c` |
| 5 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-8cd2474c-22a5-464b-850a-da7e15c18876` |
| 6 | `POST /v1/auth/token` | 401 | 11 | `qa-29f081b4-2800-4c45-8f37-22ea7b36823d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-21e7e000-70b0-4d48-81c8-43ac6d336909

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21e7e000-70b0-4d48-81c8-43ac6d336909
Content-Type: application/json

--- request body ---
{"handle":"qa-48fbf2c42ae6","displayName":"QA 48fbf2c42ae6","password":"****","region":"eu"}

--- response: 201 in 418 ms ---
Date: Wed, 28 Oct 2026 08:43:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-21e7e000-70b0-4d48-81c8-43ac6d336909
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-48fbf2c42ae6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a061d631-6432-4835-8b9d-e0c6c4747518","handle":"qa-48fbf2c42ae6","displayName":"QA 48fbf2c42ae6","region":"eu","role":"user","createdAt":"2026-10-28T08:43:03.563627777Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0dd505b5-3088-49ba-8b40-24156ff8edb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dd505b5-3088-49ba-8b40-24156ff8edb2
Content-Type: application/json

--- request body ---
{"handle":"qa-48fbf2c42ae6","password":"****"}

--- response: 200 in 61 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dd505b5-3088-49ba-8b40-24156ff8edb2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a061d631-6432-4835-8b9d-e0c6c4747518"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d606fe6e-d6eb-4155-9b5d-23e6e183d59a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d606fe6e-d6eb-4155-9b5d-23e6e183d59a
Content-Type: application/json

--- response: 200 in 79 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d606fe6e-d6eb-4155-9b5d-23e6e183d59a
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

{"id":"acc_a061d631-6432-4835-8b9d-e0c6c4747518","handle":"qa-48fbf2c42ae6","displayName":"QA 48fbf2c42ae6","region":"eu","role":"user","createdAt":"2026-10-28T08:43:03.563627777Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-82058be2-ff56-4ce9-b2f9-e5cb280efc9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82058be2-ff56-4ce9-b2f9-e5cb280efc9c
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-82058be2-ff56-4ce9-b2f9-e5cb280efc9c
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

{"id":"acc_a061d631-6432-4835-8b9d-e0c6c4747518","handle":"qa-48fbf2c42ae6","displayName":"QA 48fbf2c42ae6","region":"eu","role":"user","createdAt":"2026-10-28T08:43:03.563627777Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8cd2474c-22a5-464b-850a-da7e15c18876

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cd2474c-22a5-464b-850a-da7e15c18876
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8cd2474c-22a5-464b-850a-da7e15c18876
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
correlation: qa-29f081b4-2800-4c45-8f37-22ea7b36823d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29f081b4-2800-4c45-8f37-22ea7b36823d
Content-Type: application/json

--- request body ---
{"handle":"qa-48fbf2c42ae6","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29f081b4-2800-4c45-8f37-22ea7b36823d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-29f081b4-2800-4c45-8f37-22ea7b36823d"}
```
