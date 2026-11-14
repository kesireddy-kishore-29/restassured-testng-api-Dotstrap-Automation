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
| 1 | `POST /v1/accounts` | 201 | 491 | `qa-8fd3d1a2-6c7e-4b95-942b-aa86c2f7e3b4` |
| 2 | `POST /v1/auth/token` | 200 | 74 | `qa-cd4a52ee-43e8-4dac-a7ed-e43081c3976e` |
| 3 | `GET /v1/accounts/me` | 200 | 54 | `qa-b1e3134f-2c28-4e83-9264-0b204554d9fb` |
| 4 | `GET /v1/accounts/me` | 200 | 15 | `qa-fcc5a51c-58f9-4e66-9e5d-2249c8c1c6df` |
| 5 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-443ee107-92aa-4a71-ac7e-10ae38598a70` |
| 6 | `POST /v1/auth/token` | 401 | 21 | `qa-f1bf0f6f-c4e0-4c96-ba00-86e051febc7d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8fd3d1a2-6c7e-4b95-942b-aa86c2f7e3b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fd3d1a2-6c7e-4b95-942b-aa86c2f7e3b4
Content-Type: application/json

--- request body ---
{"handle":"qa-6e6531872de4","displayName":"QA 6e6531872de4","password":"****","region":"eu"}

--- response: 201 in 491 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fd3d1a2-6c7e-4b95-942b-aa86c2f7e3b4
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
Location: /v1/accounts/qa-6e6531872de4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_53928aa8-a869-4c1c-8d80-d77cfb337549","handle":"qa-6e6531872de4","displayName":"QA 6e6531872de4","region":"eu","role":"user","createdAt":"2026-11-13T09:42:10.028262698Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-cd4a52ee-43e8-4dac-a7ed-e43081c3976e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd4a52ee-43e8-4dac-a7ed-e43081c3976e
Content-Type: application/json

--- request body ---
{"handle":"qa-6e6531872de4","password":"****"}

--- response: 200 in 74 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd4a52ee-43e8-4dac-a7ed-e43081c3976e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_53928aa8-a869-4c1c-8d80-d77cfb337549"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-b1e3134f-2c28-4e83-9264-0b204554d9fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1e3134f-2c28-4e83-9264-0b204554d9fb
Content-Type: application/json

--- response: 200 in 54 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1e3134f-2c28-4e83-9264-0b204554d9fb
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

{"id":"acc_53928aa8-a869-4c1c-8d80-d77cfb337549","handle":"qa-6e6531872de4","displayName":"QA 6e6531872de4","region":"eu","role":"user","createdAt":"2026-11-13T09:42:10.028262698Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-fcc5a51c-58f9-4e66-9e5d-2249c8c1c6df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcc5a51c-58f9-4e66-9e5d-2249c8c1c6df
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcc5a51c-58f9-4e66-9e5d-2249c8c1c6df
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

{"id":"acc_53928aa8-a869-4c1c-8d80-d77cfb337549","handle":"qa-6e6531872de4","displayName":"QA 6e6531872de4","region":"eu","role":"user","createdAt":"2026-11-13T09:42:10.028262698Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-443ee107-92aa-4a71-ac7e-10ae38598a70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-443ee107-92aa-4a71-ac7e-10ae38598a70
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-443ee107-92aa-4a71-ac7e-10ae38598a70
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
correlation: qa-f1bf0f6f-c4e0-4c96-ba00-86e051febc7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1bf0f6f-c4e0-4c96-ba00-86e051febc7d
Content-Type: application/json

--- request body ---
{"handle":"qa-6e6531872de4","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1bf0f6f-c4e0-4c96-ba00-86e051febc7d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f1bf0f6f-c4e0-4c96-ba00-86e051febc7d"}
```
