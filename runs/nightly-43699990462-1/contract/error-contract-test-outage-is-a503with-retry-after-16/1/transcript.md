# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-9a750d44-df93-4b6a-ae60-d1e126ba8785` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-dff93a3e-bad6-40c7-a2a4-b8ca49cfb150` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-069ef61d-3202-45d7-a1eb-cc09ea7d9567` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-af7fabdb-e2b3-4963-a371-ba13e35bcd83` |
| 5 | `GET /v1/admin/stats` | 503 | 14 | `qa-3ba6521b-8613-4386-953d-78c34df79f75` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-cf6f053b-c3b9-4c18-b5e7-42cd2500a7ce` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-d41f13e2-9ea7-4abc-a5cc-86b13765a3bd` |
| 8 | `POST /v1/auth/token` | 401 | 3 | `qa-6ad09b81-1fdf-4405-a0be-ab8667757c3b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-f3787859-2d5f-41c6-b01f-197d30026531` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-a4868296-5e64-47eb-bef4-0a3b0e8b51f3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9a750d44-df93-4b6a-ae60-d1e126ba8785

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a750d44-df93-4b6a-ae60-d1e126ba8785
Content-Type: application/json

--- request body ---
{"handle":"qa-ee1358090a3c","displayName":"QA ee1358090a3c","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a750d44-df93-4b6a-ae60-d1e126ba8785
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 7
Location: /v1/accounts/qa-ee1358090a3c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_17cdf5c1-181c-4626-9284-3ed104abb8b1","handle":"qa-ee1358090a3c","displayName":"QA ee1358090a3c","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.588225765Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dff93a3e-bad6-40c7-a2a4-b8ca49cfb150

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dff93a3e-bad6-40c7-a2a4-b8ca49cfb150
Content-Type: application/json

--- request body ---
{"handle":"qa-a22ba37922a2","displayName":"QA a22ba37922a2","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-dff93a3e-bad6-40c7-a2a4-b8ca49cfb150
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 7
Location: /v1/accounts/qa-a22ba37922a2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_715f2867-a0b4-414b-b991-83fc158a7362","handle":"qa-a22ba37922a2","displayName":"QA a22ba37922a2","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.624138034Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-069ef61d-3202-45d7-a1eb-cc09ea7d9567

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-069ef61d-3202-45d7-a1eb-cc09ea7d9567
Content-Type: application/json

--- request body ---
{"handle":"qa-ee1358090a3c","password":"****"}

--- response: 200 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-069ef61d-3202-45d7-a1eb-cc09ea7d9567
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_17cdf5c1-181c-4626-9284-3ed104abb8b1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-af7fabdb-e2b3-4963-a371-ba13e35bcd83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af7fabdb-e2b3-4963-a371-ba13e35bcd83
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a22ba37922a2","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-af7fabdb-e2b3-4963-a371-ba13e35bcd83
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
Location: /v1/conversations/cnv_702b75dd-2c3a-4bc0-8384-1fa2ae6c64f0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_702b75dd-2c3a-4bc0-8384-1fa2ae6c64f0","subject":"Error contract","status":"open","region":"eu","participants":["qa-ee1358090a3c","qa-a22ba37922a2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.660232751Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-3ba6521b-8613-4386-953d-78c34df79f75

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 1a42e0b7-ef19-4cb3-8769-5fca42de6b29
X-Correlation-Id: qa-3ba6521b-8613-4386-953d-78c34df79f75
Content-Type: application/json

--- response: 503 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ba6521b-8613-4386-953d-78c34df79f75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-3ba6521b-8613-4386-953d-78c34df79f75"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cf6f053b-c3b9-4c18-b5e7-42cd2500a7ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf6f053b-c3b9-4c18-b5e7-42cd2500a7ce
Content-Type: application/json

--- request body ---
{"handle":"qa-a22ba37922a2","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf6f053b-c3b9-4c18-b5e7-42cd2500a7ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_715f2867-a0b4-414b-b991-83fc158a7362"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d41f13e2-9ea7-4abc-a5cc-86b13765a3bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d41f13e2-9ea7-4abc-a5cc-86b13765a3bd
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d41f13e2-9ea7-4abc-a5cc-86b13765a3bd
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
correlation: qa-6ad09b81-1fdf-4405-a0be-ab8667757c3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ad09b81-1fdf-4405-a0be-ab8667757c3b
Content-Type: application/json

--- request body ---
{"handle":"qa-a22ba37922a2","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ad09b81-1fdf-4405-a0be-ab8667757c3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ad09b81-1fdf-4405-a0be-ab8667757c3b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f3787859-2d5f-41c6-b01f-197d30026531

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3787859-2d5f-41c6-b01f-197d30026531
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f3787859-2d5f-41c6-b01f-197d30026531
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
correlation: qa-a4868296-5e64-47eb-bef4-0a3b0e8b51f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4868296-5e64-47eb-bef4-0a3b0e8b51f3
Content-Type: application/json

--- request body ---
{"handle":"qa-ee1358090a3c","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4868296-5e64-47eb-bef4-0a3b0e8b51f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a4868296-5e64-47eb-bef4-0a3b0e8b51f3"}
```
