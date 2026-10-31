# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-d9759d43-41aa-4947-97e7-5dfa7fe68e3e` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-d2c7af77-1974-4f23-ba24-4e7a8a0bb4d0` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 41 | `qa-0e1762c9-6ab0-4126-9aaa-88996a20f825` |
| 4 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-b4350d6c-c126-4798-a4c3-c09fd54e837d` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-a2552f03-53eb-4a13-8db0-6793d970ba52` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d9759d43-41aa-4947-97e7-5dfa7fe68e3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9759d43-41aa-4947-97e7-5dfa7fe68e3e
Content-Type: application/json

--- request body ---
{"handle":"qa-b9098f4be459","displayName":"QA b9098f4be459","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9759d43-41aa-4947-97e7-5dfa7fe68e3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 6
Location: /v1/accounts/qa-b9098f4be459
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9718a2ef-c29e-4b23-b48e-ae3524efaa6d","handle":"qa-b9098f4be459","displayName":"QA b9098f4be459","region":"eu","role":"user","createdAt":"2026-10-27T08:00:36.184830712Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d2c7af77-1974-4f23-ba24-4e7a8a0bb4d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2c7af77-1974-4f23-ba24-4e7a8a0bb4d0
Content-Type: application/json

--- request body ---
{"handle":"qa-b9098f4be459","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2c7af77-1974-4f23-ba24-4e7a8a0bb4d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9718a2ef-c29e-4b23-b48e-ae3524efaa6d"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-0e1762c9-6ab0-4126-9aaa-88996a20f825

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e1762c9-6ab0-4126-9aaa-88996a20f825
Content-Type: application/json

--- response: 404 in 41 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e1762c9-6ab0-4126-9aaa-88996a20f825
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-0e1762c9-6ab0-4126-9aaa-88996a20f825"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b4350d6c-c126-4798-a4c3-c09fd54e837d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4350d6c-c126-4798-a4c3-c09fd54e837d
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b4350d6c-c126-4798-a4c3-c09fd54e837d
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a2552f03-53eb-4a13-8db0-6793d970ba52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2552f03-53eb-4a13-8db0-6793d970ba52
Content-Type: application/json

--- request body ---
{"handle":"qa-b9098f4be459","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a2552f03-53eb-4a13-8db0-6793d970ba52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a2552f03-53eb-4a13-8db0-6793d970ba52"}
```
