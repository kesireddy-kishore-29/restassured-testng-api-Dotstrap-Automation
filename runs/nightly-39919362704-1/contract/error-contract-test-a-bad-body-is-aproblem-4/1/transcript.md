# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-3448fd5e-3dc7-4afa-94a3-532393941c83` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-cc637b08-9066-411a-837c-1f62b343187d` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-36cbd426-de46-4726-b626-4ceee4f31fcc` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-61f1cdbf-9be2-43f0-a659-e72eecc37fdb` |
| 5 | `POST /v1/accounts` | 415 | 36 | `qa-161df988-8f4d-4d2b-820e-fc592844f45e` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-7482e961-e407-45b9-8cb1-c91c9bf1c34e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-34a2fb34-65a1-4129-a7c6-38ab710bf0f1` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-c5f2d4f6-2514-465c-ba51-3b4b4db09822` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-0945088f-abec-4bf3-a21a-9dba161586e8` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-99681fa1-2b82-4632-b954-1bd142bbcdcc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3448fd5e-3dc7-4afa-94a3-532393941c83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3448fd5e-3dc7-4afa-94a3-532393941c83
Content-Type: application/json

--- request body ---
{"handle":"qa-28f12580790a","displayName":"QA 28f12580790a","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-3448fd5e-3dc7-4afa-94a3-532393941c83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Location: /v1/accounts/qa-28f12580790a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e94e87ab-8fb0-4a8b-8da6-ba54d872bc2f","handle":"qa-28f12580790a","displayName":"QA 28f12580790a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.431126111Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cc637b08-9066-411a-837c-1f62b343187d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc637b08-9066-411a-837c-1f62b343187d
Content-Type: application/json

--- request body ---
{"handle":"qa-a4e766a293e0","displayName":"QA a4e766a293e0","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc637b08-9066-411a-837c-1f62b343187d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 7
Location: /v1/accounts/qa-a4e766a293e0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a1f8119c-333e-4af4-80bf-326c8d86dd3c","handle":"qa-a4e766a293e0","displayName":"QA a4e766a293e0","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.506391824Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-36cbd426-de46-4726-b626-4ceee4f31fcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36cbd426-de46-4726-b626-4ceee4f31fcc
Content-Type: application/json

--- request body ---
{"handle":"qa-28f12580790a","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-36cbd426-de46-4726-b626-4ceee4f31fcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e94e87ab-8fb0-4a8b-8da6-ba54d872bc2f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-61f1cdbf-9be2-43f0-a659-e72eecc37fdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61f1cdbf-9be2-43f0-a659-e72eecc37fdb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a4e766a293e0","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-61f1cdbf-9be2-43f0-a659-e72eecc37fdb
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
Location: /v1/conversations/cnv_fd5b89e3-54de-4440-85d7-01f546981a87
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fd5b89e3-54de-4440-85d7-01f546981a87","subject":"Error contract","status":"open","region":"eu","participants":["qa-28f12580790a","qa-a4e766a293e0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:45.618019791Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-161df988-8f4d-4d2b-820e-fc592844f45e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-161df988-8f4d-4d2b-820e-fc592844f45e
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 36 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-161df988-8f4d-4d2b-820e-fc592844f45e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 7
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-161df988-8f4d-4d2b-820e-fc592844f45e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7482e961-e407-45b9-8cb1-c91c9bf1c34e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7482e961-e407-45b9-8cb1-c91c9bf1c34e
Content-Type: application/json

--- request body ---
{"handle":"qa-a4e766a293e0","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-7482e961-e407-45b9-8cb1-c91c9bf1c34e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a1f8119c-333e-4af4-80bf-326c8d86dd3c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-34a2fb34-65a1-4129-a7c6-38ab710bf0f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34a2fb34-65a1-4129-a7c6-38ab710bf0f1
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-34a2fb34-65a1-4129-a7c6-38ab710bf0f1
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-c5f2d4f6-2514-465c-ba51-3b4b4db09822

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5f2d4f6-2514-465c-ba51-3b4b4db09822
Content-Type: application/json

--- request body ---
{"handle":"qa-a4e766a293e0","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5f2d4f6-2514-465c-ba51-3b4b4db09822
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c5f2d4f6-2514-465c-ba51-3b4b4db09822"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0945088f-abec-4bf3-a21a-9dba161586e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0945088f-abec-4bf3-a21a-9dba161586e8
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0945088f-abec-4bf3-a21a-9dba161586e8
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-99681fa1-2b82-4632-b954-1bd142bbcdcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99681fa1-2b82-4632-b954-1bd142bbcdcc
Content-Type: application/json

--- request body ---
{"handle":"qa-28f12580790a","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99681fa1-2b82-4632-b954-1bd142bbcdcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-99681fa1-2b82-4632-b954-1bd142bbcdcc"}
```
