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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-49412ecf-9e4e-42d6-94de-548224864edf` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-2ba015b5-9a10-4a3a-81f4-138647b186fd` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 11 | `qa-30f4e210-0ab4-496a-a6f6-018845d7c32a` |
| 4 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-a1c9a956-0198-44cb-9696-0fcf440bdaed` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-e79e0fc1-1169-4fdb-9f89-4b44aee53d3a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-49412ecf-9e4e-42d6-94de-548224864edf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49412ecf-9e4e-42d6-94de-548224864edf
Content-Type: application/json

--- request body ---
{"handle":"qa-6bfbc546a475","displayName":"QA 6bfbc546a475","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-49412ecf-9e4e-42d6-94de-548224864edf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 8
Location: /v1/accounts/qa-6bfbc546a475
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b3258ff7-1fdb-4035-8031-61e5efb7372d","handle":"qa-6bfbc546a475","displayName":"QA 6bfbc546a475","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.855553739Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2ba015b5-9a10-4a3a-81f4-138647b186fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ba015b5-9a10-4a3a-81f4-138647b186fd
Content-Type: application/json

--- request body ---
{"handle":"qa-6bfbc546a475","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ba015b5-9a10-4a3a-81f4-138647b186fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b3258ff7-1fdb-4035-8031-61e5efb7372d"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-30f4e210-0ab4-496a-a6f6-018845d7c32a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30f4e210-0ab4-496a-a6f6-018845d7c32a
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30f4e210-0ab4-496a-a6f6-018845d7c32a
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-30f4e210-0ab4-496a-a6f6-018845d7c32a"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a1c9a956-0198-44cb-9696-0fcf440bdaed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1c9a956-0198-44cb-9696-0fcf440bdaed
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a1c9a956-0198-44cb-9696-0fcf440bdaed
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
correlation: qa-e79e0fc1-1169-4fdb-9f89-4b44aee53d3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e79e0fc1-1169-4fdb-9f89-4b44aee53d3a
Content-Type: application/json

--- request body ---
{"handle":"qa-6bfbc546a475","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e79e0fc1-1169-4fdb-9f89-4b44aee53d3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e79e0fc1-1169-4fdb-9f89-4b44aee53d3a"}
```
