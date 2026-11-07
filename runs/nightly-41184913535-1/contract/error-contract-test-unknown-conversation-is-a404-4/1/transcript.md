# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-9b354865-c5f7-45dd-b48a-f87e4214ea64` |
| 2 | `POST /v1/auth/token` | 200 | 32 | `qa-59eea7cf-0729-4c11-a6fc-0b33fc3cd19d` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 6 | `qa-f433cddb-e483-4b11-854a-36bec9693baa` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-c3f2bb98-be55-4fe5-8c88-716a40bdf9a3` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-601b8791-0fe1-4554-a8c1-124baf87c67f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9b354865-c5f7-45dd-b48a-f87e4214ea64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b354865-c5f7-45dd-b48a-f87e4214ea64
Content-Type: application/json

--- request body ---
{"handle":"qa-412cd4527c1a","displayName":"QA 412cd4527c1a","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b354865-c5f7-45dd-b48a-f87e4214ea64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 6
Location: /v1/accounts/qa-412cd4527c1a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d8829926-34a7-4793-be87-e78057ead152","handle":"qa-412cd4527c1a","displayName":"QA 412cd4527c1a","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.320150208Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-59eea7cf-0729-4c11-a6fc-0b33fc3cd19d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59eea7cf-0729-4c11-a6fc-0b33fc3cd19d
Content-Type: application/json

--- request body ---
{"handle":"qa-412cd4527c1a","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-59eea7cf-0729-4c11-a6fc-0b33fc3cd19d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d8829926-34a7-4793-be87-e78057ead152"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-f433cddb-e483-4b11-854a-36bec9693baa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f433cddb-e483-4b11-854a-36bec9693baa
Content-Type: application/json

--- response: 404 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f433cddb-e483-4b11-854a-36bec9693baa
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
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-f433cddb-e483-4b11-854a-36bec9693baa"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c3f2bb98-be55-4fe5-8c88-716a40bdf9a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3f2bb98-be55-4fe5-8c88-716a40bdf9a3
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c3f2bb98-be55-4fe5-8c88-716a40bdf9a3
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
correlation: qa-601b8791-0fe1-4554-a8c1-124baf87c67f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-601b8791-0fe1-4554-a8c1-124baf87c67f
Content-Type: application/json

--- request body ---
{"handle":"qa-412cd4527c1a","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-601b8791-0fe1-4554-a8c1-124baf87c67f
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-601b8791-0fe1-4554-a8c1-124baf87c67f"}
```
