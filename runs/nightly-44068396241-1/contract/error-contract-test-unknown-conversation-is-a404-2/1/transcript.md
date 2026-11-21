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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-89bb148c-fd25-4877-8ed2-456eb1b02c0f` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-1792ce20-b47f-4ad5-aae6-0bcc76f629b3` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 14 | `qa-541973cb-c756-4847-bc8a-b44777b15947` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-720881a1-d13b-4d5c-928c-9c34ab34e358` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-2e4b5550-ee85-4ff9-9a33-3e86b19eb386` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-89bb148c-fd25-4877-8ed2-456eb1b02c0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89bb148c-fd25-4877-8ed2-456eb1b02c0f
Content-Type: application/json

--- request body ---
{"handle":"qa-fe9fa609cc6a","displayName":"QA fe9fa609cc6a","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-89bb148c-fd25-4877-8ed2-456eb1b02c0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 7
Location: /v1/accounts/qa-fe9fa609cc6a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9857a676-b910-463e-a8d6-4deb88b85ac4","handle":"qa-fe9fa609cc6a","displayName":"QA fe9fa609cc6a","region":"eu","role":"user","createdAt":"2026-11-17T10:50:20.305744761Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1792ce20-b47f-4ad5-aae6-0bcc76f629b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1792ce20-b47f-4ad5-aae6-0bcc76f629b3
Content-Type: application/json

--- request body ---
{"handle":"qa-fe9fa609cc6a","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-1792ce20-b47f-4ad5-aae6-0bcc76f629b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9857a676-b910-463e-a8d6-4deb88b85ac4"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-541973cb-c756-4847-bc8a-b44777b15947

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-541973cb-c756-4847-bc8a-b44777b15947
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-541973cb-c756-4847-bc8a-b44777b15947
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-541973cb-c756-4847-bc8a-b44777b15947"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-720881a1-d13b-4d5c-928c-9c34ab34e358

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-720881a1-d13b-4d5c-928c-9c34ab34e358
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-720881a1-d13b-4d5c-928c-9c34ab34e358
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
correlation: qa-2e4b5550-ee85-4ff9-9a33-3e86b19eb386

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e4b5550-ee85-4ff9-9a33-3e86b19eb386
Content-Type: application/json

--- request body ---
{"handle":"qa-fe9fa609cc6a","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e4b5550-ee85-4ff9-9a33-3e86b19eb386
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2e4b5550-ee85-4ff9-9a33-3e86b19eb386"}
```
