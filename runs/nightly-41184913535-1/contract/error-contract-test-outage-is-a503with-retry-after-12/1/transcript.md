# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-d22572b5-39b3-4f3f-9e51-fe7db35af872` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-42e74102-16e8-4cbf-a7d8-cfeae3e1d847` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-dedacb5f-1a2c-4b54-8855-539c874e8363` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-963a6626-6d55-4728-8db2-961521665b03` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 22 | `qa-dc0d4a3b-d382-453c-8f59-9b85b1ed30ed` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-09eaba48-a607-46ce-9cba-6c2b9e66e30d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-2a175797-9aaa-46c9-8dd5-5b92648fe572` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-14041fb5-bd2f-42f7-8374-2d2d0d2de617` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-ff68256b-cd6e-4d92-98f2-1a27e41e1a17` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-641e6e0d-8b71-4a8a-84a6-9de1a22db84f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d22572b5-39b3-4f3f-9e51-fe7db35af872

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d22572b5-39b3-4f3f-9e51-fe7db35af872
Content-Type: application/json

--- request body ---
{"handle":"qa-83288e9f6efa","displayName":"QA 83288e9f6efa","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d22572b5-39b3-4f3f-9e51-fe7db35af872
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 7
Location: /v1/accounts/qa-83288e9f6efa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50a46ed4-6ce1-4c1c-97dd-0ced50b95d64","handle":"qa-83288e9f6efa","displayName":"QA 83288e9f6efa","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.156101409Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-42e74102-16e8-4cbf-a7d8-cfeae3e1d847

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42e74102-16e8-4cbf-a7d8-cfeae3e1d847
Content-Type: application/json

--- request body ---
{"handle":"qa-a7a2c167e76b","displayName":"QA a7a2c167e76b","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-42e74102-16e8-4cbf-a7d8-cfeae3e1d847
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 7
Location: /v1/accounts/qa-a7a2c167e76b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_84ebe505-a4bc-420e-8e0b-5238543d9c48","handle":"qa-a7a2c167e76b","displayName":"QA a7a2c167e76b","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.183965789Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dedacb5f-1a2c-4b54-8855-539c874e8363

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dedacb5f-1a2c-4b54-8855-539c874e8363
Content-Type: application/json

--- request body ---
{"handle":"qa-83288e9f6efa","password":"****"}

--- response: 200 in 44 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-dedacb5f-1a2c-4b54-8855-539c874e8363
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50a46ed4-6ce1-4c1c-97dd-0ced50b95d64"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-963a6626-6d55-4728-8db2-961521665b03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-963a6626-6d55-4728-8db2-961521665b03
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a7a2c167e76b","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-963a6626-6d55-4728-8db2-961521665b03
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
Location: /v1/conversations/cnv_ee1358c9-ba2a-455f-bccd-87995348d2f3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ee1358c9-ba2a-455f-bccd-87995348d2f3","subject":"Error contract","status":"open","region":"eu","participants":["qa-83288e9f6efa","qa-a7a2c167e76b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.291554573Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ee1358c9-ba2a-455f-bccd-87995348d2f3/close
correlation: qa-dc0d4a3b-d382-453c-8f59-9b85b1ed30ed

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 29fe7f0a-5593-43eb-929f-e9cd7b1f37f8
X-Correlation-Id: qa-dc0d4a3b-d382-453c-8f59-9b85b1ed30ed
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc0d4a3b-d382-453c-8f59-9b85b1ed30ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_ee1358c9-ba2a-455f-bccd-87995348d2f3/close","correlationId":"qa-dc0d4a3b-d382-453c-8f59-9b85b1ed30ed"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-09eaba48-a607-46ce-9cba-6c2b9e66e30d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09eaba48-a607-46ce-9cba-6c2b9e66e30d
Content-Type: application/json

--- request body ---
{"handle":"qa-a7a2c167e76b","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-09eaba48-a607-46ce-9cba-6c2b9e66e30d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_84ebe505-a4bc-420e-8e0b-5238543d9c48"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2a175797-9aaa-46c9-8dd5-5b92648fe572

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a175797-9aaa-46c9-8dd5-5b92648fe572
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2a175797-9aaa-46c9-8dd5-5b92648fe572
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
correlation: qa-14041fb5-bd2f-42f7-8374-2d2d0d2de617

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14041fb5-bd2f-42f7-8374-2d2d0d2de617
Content-Type: application/json

--- request body ---
{"handle":"qa-a7a2c167e76b","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14041fb5-bd2f-42f7-8374-2d2d0d2de617
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-14041fb5-bd2f-42f7-8374-2d2d0d2de617"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff68256b-cd6e-4d92-98f2-1a27e41e1a17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff68256b-cd6e-4d92-98f2-1a27e41e1a17
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff68256b-cd6e-4d92-98f2-1a27e41e1a17
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
correlation: qa-641e6e0d-8b71-4a8a-84a6-9de1a22db84f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-641e6e0d-8b71-4a8a-84a6-9de1a22db84f
Content-Type: application/json

--- request body ---
{"handle":"qa-83288e9f6efa","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-641e6e0d-8b71-4a8a-84a6-9de1a22db84f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-641e6e0d-8b71-4a8a-84a6-9de1a22db84f"}
```
