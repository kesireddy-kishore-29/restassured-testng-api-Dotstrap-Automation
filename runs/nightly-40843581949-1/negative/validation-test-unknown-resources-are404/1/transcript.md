# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-23e8cebc-39ff-4c39-a41f-5d7238447ad7` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-b9645ea8-5111-45f6-8c12-48db34a513f2` |
| 3 | `GET /v1/conversations/{id}` | 404 | 9 | `qa-ed1c1b8e-9b4d-4a00-a70f-46283b1e1ee3` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 7 | `qa-c37c3329-fcc2-45bf-aeb3-faca89ad5345` |
| 5 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-293b8f83-7b5c-4716-8671-d80a6a69a94e` |
| 6 | `POST /v1/auth/token` | 401 | 4 | `qa-2fb164a5-6bdd-4ba4-b113-c33d01d46fda` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-23e8cebc-39ff-4c39-a41f-5d7238447ad7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23e8cebc-39ff-4c39-a41f-5d7238447ad7
Content-Type: application/json

--- request body ---
{"handle":"qa-b490f9045507","displayName":"QA b490f9045507","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-23e8cebc-39ff-4c39-a41f-5d7238447ad7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Location: /v1/accounts/qa-b490f9045507
X-Served-Region: eu
Content-Length: 181

{"id":"acc_79f0598e-bee8-42e2-b89e-3644a722c247","handle":"qa-b490f9045507","displayName":"QA b490f9045507","region":"eu","role":"user","createdAt":"2026-10-29T08:38:51.901257832Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b9645ea8-5111-45f6-8c12-48db34a513f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9645ea8-5111-45f6-8c12-48db34a513f2
Content-Type: application/json

--- request body ---
{"handle":"qa-b490f9045507","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9645ea8-5111-45f6-8c12-48db34a513f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79f0598e-bee8-42e2-b89e-3644a722c247"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-ed1c1b8e-9b4d-4a00-a70f-46283b1e1ee3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed1c1b8e-9b4d-4a00-a70f-46283b1e1ee3
Content-Type: application/json

--- response: 404 in 9 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed1c1b8e-9b4d-4a00-a70f-46283b1e1ee3
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-ed1c1b8e-9b4d-4a00-a70f-46283b1e1ee3"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-c37c3329-fcc2-45bf-aeb3-faca89ad5345

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c37c3329-fcc2-45bf-aeb3-faca89ad5345
Content-Type: application/json

--- response: 404 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c37c3329-fcc2-45bf-aeb3-faca89ad5345
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-c37c3329-fcc2-45bf-aeb3-faca89ad5345"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-293b8f83-7b5c-4716-8671-d80a6a69a94e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-293b8f83-7b5c-4716-8671-d80a6a69a94e
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-293b8f83-7b5c-4716-8671-d80a6a69a94e
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
correlation: qa-2fb164a5-6bdd-4ba4-b113-c33d01d46fda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fb164a5-6bdd-4ba4-b113-c33d01d46fda
Content-Type: application/json

--- request body ---
{"handle":"qa-b490f9045507","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 29 Oct 2026 08:38:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fb164a5-6bdd-4ba4-b113-c33d01d46fda
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2fb164a5-6bdd-4ba4-b113-c33d01d46fda"}
```
