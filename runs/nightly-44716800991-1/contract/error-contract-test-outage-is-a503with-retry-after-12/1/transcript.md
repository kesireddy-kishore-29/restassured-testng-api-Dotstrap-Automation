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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-65fffe67-5521-464e-90b0-3105aeabfc97` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-71cd9a47-3c99-414b-b6ad-5380380fea26` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-9e241b06-c2e8-4d01-a784-4df4eeba406b` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-45bc1fcc-9b88-40f8-acb6-ef2b956146db` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 19 | `qa-440fd721-f1b1-4f99-9ee0-12ddacfba51d` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-122d9f70-637b-4c33-bac7-7be5fe75c906` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-7a11f226-0d82-457f-bbb8-de8c67f6f6be` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-078aa52a-16b8-42e6-8131-5d4d6cbc5288` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-0f00dc68-879a-48cb-ba91-7ac5d9985685` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-979f3517-6ef2-43e0-8d16-b9e62f574a40` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-65fffe67-5521-464e-90b0-3105aeabfc97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65fffe67-5521-464e-90b0-3105aeabfc97
Content-Type: application/json

--- request body ---
{"handle":"qa-237ad48eae6b","displayName":"QA 237ad48eae6b","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-65fffe67-5521-464e-90b0-3105aeabfc97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 7
Location: /v1/accounts/qa-237ad48eae6b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bcdc1c96-8f70-4faa-b3fb-64e7b8477b96","handle":"qa-237ad48eae6b","displayName":"QA 237ad48eae6b","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.165946212Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-71cd9a47-3c99-414b-b6ad-5380380fea26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71cd9a47-3c99-414b-b6ad-5380380fea26
Content-Type: application/json

--- request body ---
{"handle":"qa-45d8ebe3b6c6","displayName":"QA 45d8ebe3b6c6","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-71cd9a47-3c99-414b-b6ad-5380380fea26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 7
Location: /v1/accounts/qa-45d8ebe3b6c6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0bfcaee1-5422-420d-8221-edae01a8f08f","handle":"qa-45d8ebe3b6c6","displayName":"QA 45d8ebe3b6c6","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.237219378Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9e241b06-c2e8-4d01-a784-4df4eeba406b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e241b06-c2e8-4d01-a784-4df4eeba406b
Content-Type: application/json

--- request body ---
{"handle":"qa-237ad48eae6b","password":"****"}

--- response: 200 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e241b06-c2e8-4d01-a784-4df4eeba406b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bcdc1c96-8f70-4faa-b3fb-64e7b8477b96"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-45bc1fcc-9b88-40f8-acb6-ef2b956146db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45bc1fcc-9b88-40f8-acb6-ef2b956146db
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-45d8ebe3b6c6","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-45bc1fcc-9b88-40f8-acb6-ef2b956146db
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
Location: /v1/conversations/cnv_eaf92737-27c1-451f-8264-ed157b921c8b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_eaf92737-27c1-451f-8264-ed157b921c8b","subject":"Error contract","status":"open","region":"eu","participants":["qa-237ad48eae6b","qa-45d8ebe3b6c6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:03.290657441Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_eaf92737-27c1-451f-8264-ed157b921c8b/close
correlation: qa-440fd721-f1b1-4f99-9ee0-12ddacfba51d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 98d1922b-7e6c-412f-8d84-62e1c1dce096
X-Correlation-Id: qa-440fd721-f1b1-4f99-9ee0-12ddacfba51d
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-440fd721-f1b1-4f99-9ee0-12ddacfba51d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_eaf92737-27c1-451f-8264-ed157b921c8b/close","correlationId":"qa-440fd721-f1b1-4f99-9ee0-12ddacfba51d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-122d9f70-637b-4c33-bac7-7be5fe75c906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-122d9f70-637b-4c33-bac7-7be5fe75c906
Content-Type: application/json

--- request body ---
{"handle":"qa-45d8ebe3b6c6","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-122d9f70-637b-4c33-bac7-7be5fe75c906
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bfcaee1-5422-420d-8221-edae01a8f08f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a11f226-0d82-457f-bbb8-de8c67f6f6be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a11f226-0d82-457f-bbb8-de8c67f6f6be
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a11f226-0d82-457f-bbb8-de8c67f6f6be
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
correlation: qa-078aa52a-16b8-42e6-8131-5d4d6cbc5288

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-078aa52a-16b8-42e6-8131-5d4d6cbc5288
Content-Type: application/json

--- request body ---
{"handle":"qa-45d8ebe3b6c6","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-078aa52a-16b8-42e6-8131-5d4d6cbc5288
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-078aa52a-16b8-42e6-8131-5d4d6cbc5288"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0f00dc68-879a-48cb-ba91-7ac5d9985685

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f00dc68-879a-48cb-ba91-7ac5d9985685
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0f00dc68-879a-48cb-ba91-7ac5d9985685
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
correlation: qa-979f3517-6ef2-43e0-8d16-b9e62f574a40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-979f3517-6ef2-43e0-8d16-b9e62f574a40
Content-Type: application/json

--- request body ---
{"handle":"qa-237ad48eae6b","password":"****"}

--- response: 401 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-979f3517-6ef2-43e0-8d16-b9e62f574a40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-979f3517-6ef2-43e0-8d16-b9e62f574a40"}
```
