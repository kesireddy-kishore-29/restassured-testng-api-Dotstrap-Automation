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
| 1 | `POST /v1/accounts` | 201 | 472 | `qa-75ecf232-2e8f-4bc5-9526-be1eaafa0695` |
| 2 | `POST /v1/auth/token` | 200 | 55 | `qa-11c8bef0-ae97-4148-8451-3014a2abc58e` |
| 3 | `GET /v1/accounts/me` | 200 | 43 | `qa-ea60f1c2-5728-4218-aa60-31bf375c2086` |
| 4 | `GET /v1/accounts/me` | 200 | 28 | `qa-327e106e-3c0e-4b56-820c-98682a9d3826` |
| 5 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-e94455e2-7d72-42bd-85b9-0ee174548905` |
| 6 | `POST /v1/auth/token` | 401 | 15 | `qa-5b0dff2f-4155-4e7e-a641-60cc56a898aa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-75ecf232-2e8f-4bc5-9526-be1eaafa0695

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75ecf232-2e8f-4bc5-9526-be1eaafa0695
Content-Type: application/json

--- request body ---
{"handle":"qa-44edb77ff74e","displayName":"QA 44edb77ff74e","password":"****","region":"eu"}

--- response: 201 in 472 ms ---
Date: Sun, 01 Nov 2026 09:23:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-75ecf232-2e8f-4bc5-9526-be1eaafa0695
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-44edb77ff74e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_356ef132-58e6-4c60-8d96-a870a425492b","handle":"qa-44edb77ff74e","displayName":"QA 44edb77ff74e","region":"eu","role":"user","createdAt":"2026-11-01T09:23:26.991311749Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-11c8bef0-ae97-4148-8451-3014a2abc58e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11c8bef0-ae97-4148-8451-3014a2abc58e
Content-Type: application/json

--- request body ---
{"handle":"qa-44edb77ff74e","password":"****"}

--- response: 200 in 55 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-11c8bef0-ae97-4148-8451-3014a2abc58e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_356ef132-58e6-4c60-8d96-a870a425492b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ea60f1c2-5728-4218-aa60-31bf375c2086

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea60f1c2-5728-4218-aa60-31bf375c2086
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea60f1c2-5728-4218-aa60-31bf375c2086
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

{"id":"acc_356ef132-58e6-4c60-8d96-a870a425492b","handle":"qa-44edb77ff74e","displayName":"QA 44edb77ff74e","region":"eu","role":"user","createdAt":"2026-11-01T09:23:26.991311749Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-327e106e-3c0e-4b56-820c-98682a9d3826

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-327e106e-3c0e-4b56-820c-98682a9d3826
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-327e106e-3c0e-4b56-820c-98682a9d3826
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

{"id":"acc_356ef132-58e6-4c60-8d96-a870a425492b","handle":"qa-44edb77ff74e","displayName":"QA 44edb77ff74e","region":"eu","role":"user","createdAt":"2026-11-01T09:23:26.991311749Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e94455e2-7d72-42bd-85b9-0ee174548905

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e94455e2-7d72-42bd-85b9-0ee174548905
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e94455e2-7d72-42bd-85b9-0ee174548905
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
correlation: qa-5b0dff2f-4155-4e7e-a641-60cc56a898aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b0dff2f-4155-4e7e-a641-60cc56a898aa
Content-Type: application/json

--- request body ---
{"handle":"qa-44edb77ff74e","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b0dff2f-4155-4e7e-a641-60cc56a898aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b0dff2f-4155-4e7e-a641-60cc56a898aa"}
```
