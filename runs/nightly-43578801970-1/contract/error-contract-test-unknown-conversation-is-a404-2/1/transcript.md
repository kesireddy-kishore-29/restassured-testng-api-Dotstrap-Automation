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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-a31055db-b2d2-450b-88dc-71af1defe749` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-9511004c-aa6a-433f-838f-3087c6a43466` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 6 | `qa-b3efeeb2-6e8d-4432-b73d-4b2f318dc5dc` |
| 4 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-25639bf4-5abf-428a-8971-040f1d80f3d8` |
| 5 | `POST /v1/auth/token` | 401 | 14 | `qa-5506ccbb-b12c-4e37-b182-1650473772de` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a31055db-b2d2-450b-88dc-71af1defe749

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a31055db-b2d2-450b-88dc-71af1defe749
Content-Type: application/json

--- request body ---
{"handle":"qa-b8af79edd37d","displayName":"QA b8af79edd37d","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-a31055db-b2d2-450b-88dc-71af1defe749
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 6
Location: /v1/accounts/qa-b8af79edd37d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_46e28f1c-3341-447f-8a42-7dbc95c4d18f","handle":"qa-b8af79edd37d","displayName":"QA b8af79edd37d","region":"eu","role":"user","createdAt":"2026-11-14T09:05:13.032203863Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9511004c-aa6a-433f-838f-3087c6a43466

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9511004c-aa6a-433f-838f-3087c6a43466
Content-Type: application/json

--- request body ---
{"handle":"qa-b8af79edd37d","password":"****"}

--- response: 200 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-9511004c-aa6a-433f-838f-3087c6a43466
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_46e28f1c-3341-447f-8a42-7dbc95c4d18f"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-b3efeeb2-6e8d-4432-b73d-4b2f318dc5dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3efeeb2-6e8d-4432-b73d-4b2f318dc5dc
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b3efeeb2-6e8d-4432-b73d-4b2f318dc5dc
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-b3efeeb2-6e8d-4432-b73d-4b2f318dc5dc"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-25639bf4-5abf-428a-8971-040f1d80f3d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25639bf4-5abf-428a-8971-040f1d80f3d8
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-25639bf4-5abf-428a-8971-040f1d80f3d8
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
correlation: qa-5506ccbb-b12c-4e37-b182-1650473772de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5506ccbb-b12c-4e37-b182-1650473772de
Content-Type: application/json

--- request body ---
{"handle":"qa-b8af79edd37d","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5506ccbb-b12c-4e37-b182-1650473772de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5506ccbb-b12c-4e37-b182-1650473772de"}
```
