# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-7fdf6ad8-c377-4ed1-86ef-c22a3aece86b` |
| 2 | `POST /v1/auth/token` | 200 | 27 | `qa-6dd20d22-1bd5-4b41-8c0d-563df076c8c1` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 11 | `qa-ab9f15ec-71cb-443a-8050-777e127578b5` |
| 4 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-38b0f55f-9057-464d-a996-4ad73d305c73` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-40efcd9b-8c33-41a2-b95c-34b566bca833` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7fdf6ad8-c377-4ed1-86ef-c22a3aece86b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fdf6ad8-c377-4ed1-86ef-c22a3aece86b
Content-Type: application/json

--- request body ---
{"handle":"qa-6ea460be3343","displayName":"QA 6ea460be3343","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fdf6ad8-c377-4ed1-86ef-c22a3aece86b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 6
Location: /v1/accounts/qa-6ea460be3343
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9d382a43-ab02-4bf2-9ade-64d394b7adbe","handle":"qa-6ea460be3343","displayName":"QA 6ea460be3343","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.447462773Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6dd20d22-1bd5-4b41-8c0d-563df076c8c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dd20d22-1bd5-4b41-8c0d-563df076c8c1
Content-Type: application/json

--- request body ---
{"handle":"qa-6ea460be3343","password":"****"}

--- response: 200 in 27 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dd20d22-1bd5-4b41-8c0d-563df076c8c1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9d382a43-ab02-4bf2-9ade-64d394b7adbe"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-ab9f15ec-71cb-443a-8050-777e127578b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab9f15ec-71cb-443a-8050-777e127578b5
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab9f15ec-71cb-443a-8050-777e127578b5
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-ab9f15ec-71cb-443a-8050-777e127578b5"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-38b0f55f-9057-464d-a996-4ad73d305c73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38b0f55f-9057-464d-a996-4ad73d305c73
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-38b0f55f-9057-464d-a996-4ad73d305c73
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
correlation: qa-40efcd9b-8c33-41a2-b95c-34b566bca833

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40efcd9b-8c33-41a2-b95c-34b566bca833
Content-Type: application/json

--- request body ---
{"handle":"qa-6ea460be3343","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40efcd9b-8c33-41a2-b95c-34b566bca833
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-40efcd9b-8c33-41a2-b95c-34b566bca833"}
```
