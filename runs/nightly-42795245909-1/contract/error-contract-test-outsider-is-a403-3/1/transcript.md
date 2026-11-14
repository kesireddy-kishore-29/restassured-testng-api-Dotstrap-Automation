# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-d15dadf4-e1ea-43a4-bd31-62e262051c79` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-eb503cbc-6299-4d34-8f1a-17aa378a1b30` |
| 3 | `POST /v1/accounts` | 201 | 26 | `qa-66981978-289f-4a85-949d-2e32daf59593` |
| 4 | `POST /v1/auth/token` | 200 | 18 | `qa-8a68a642-7195-462a-ab3c-cd4535f5230b` |
| 5 | `POST /v1/conversations` | 201 | 15 | `qa-a51c19e2-7b16-4dfd-9c08-cd2fce35b16a` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-6ef0e45a-06fd-405b-8d49-9926f5337766` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 8 | `qa-d4bae829-0658-42fd-9768-88994ffa3f81` |
| 8 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-0fe1a67d-9e91-45b4-8552-bb32777e1db6` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-4061d0f7-2ac2-4b22-975f-8b2d02c3427f` |
| 10 | `POST /v1/auth/token` | 200 | 34 | `qa-36b5ad6c-042d-4a2a-bbf9-984711050db4` |
| 11 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-ff82b2fe-8cdb-47ab-b70b-f66046843a2d` |
| 12 | `POST /v1/auth/token` | 401 | 35 | `qa-04461957-9572-4a24-b363-ccfa8bd9205f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-c4d73630-f443-458f-9b98-0f34fb8262fe` |
| 14 | `POST /v1/auth/token` | 401 | 19 | `qa-46bef117-bb1d-443e-b812-7f9c4ef826f5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d15dadf4-e1ea-43a4-bd31-62e262051c79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d15dadf4-e1ea-43a4-bd31-62e262051c79
Content-Type: application/json

--- request body ---
{"handle":"qa-78bbb295a165","displayName":"QA 78bbb295a165","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d15dadf4-e1ea-43a4-bd31-62e262051c79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Location: /v1/accounts/qa-78bbb295a165
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f528fbc7-4104-4a8f-8cf4-128498a06e3d","handle":"qa-78bbb295a165","displayName":"QA 78bbb295a165","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.269531717Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eb503cbc-6299-4d34-8f1a-17aa378a1b30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb503cbc-6299-4d34-8f1a-17aa378a1b30
Content-Type: application/json

--- request body ---
{"handle":"qa-9b8f13896793","displayName":"QA 9b8f13896793","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb503cbc-6299-4d34-8f1a-17aa378a1b30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Location: /v1/accounts/qa-9b8f13896793
X-Served-Region: eu
Content-Length: 181

{"id":"acc_02f8370d-3548-45f9-a5e0-a2a37f15ba77","handle":"qa-9b8f13896793","displayName":"QA 9b8f13896793","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.320895871Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-66981978-289f-4a85-949d-2e32daf59593

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66981978-289f-4a85-949d-2e32daf59593
Content-Type: application/json

--- request body ---
{"handle":"qa-044eb5ebc7bb","displayName":"QA 044eb5ebc7bb","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-66981978-289f-4a85-949d-2e32daf59593
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Location: /v1/accounts/qa-044eb5ebc7bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_415f68b9-96ff-4e2c-906c-18d4ee020d0b","handle":"qa-044eb5ebc7bb","displayName":"QA 044eb5ebc7bb","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.349196709Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8a68a642-7195-462a-ab3c-cd4535f5230b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a68a642-7195-462a-ab3c-cd4535f5230b
Content-Type: application/json

--- request body ---
{"handle":"qa-78bbb295a165","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a68a642-7195-462a-ab3c-cd4535f5230b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f528fbc7-4104-4a8f-8cf4-128498a06e3d"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a51c19e2-7b16-4dfd-9c08-cd2fce35b16a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a51c19e2-7b16-4dfd-9c08-cd2fce35b16a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9b8f13896793","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a51c19e2-7b16-4dfd-9c08-cd2fce35b16a
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
Location: /v1/conversations/cnv_4d724fbd-23de-4cb8-9471-a78b3be38605
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4d724fbd-23de-4cb8-9471-a78b3be38605","subject":"Error contract","status":"open","region":"eu","participants":["qa-78bbb295a165","qa-9b8f13896793"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:35.406001702Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6ef0e45a-06fd-405b-8d49-9926f5337766

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ef0e45a-06fd-405b-8d49-9926f5337766
Content-Type: application/json

--- request body ---
{"handle":"qa-044eb5ebc7bb","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ef0e45a-06fd-405b-8d49-9926f5337766
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_415f68b9-96ff-4e2c-906c-18d4ee020d0b"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_4d724fbd-23de-4cb8-9471-a78b3be38605/read
correlation: qa-d4bae829-0658-42fd-9768-88994ffa3f81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4bae829-0658-42fd-9768-88994ffa3f81
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4bae829-0658-42fd-9768-88994ffa3f81
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_4d724fbd-23de-4cb8-9471-a78b3be38605/read","correlationId":"qa-d4bae829-0658-42fd-9768-88994ffa3f81"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0fe1a67d-9e91-45b4-8552-bb32777e1db6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fe1a67d-9e91-45b4-8552-bb32777e1db6
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0fe1a67d-9e91-45b4-8552-bb32777e1db6
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-4061d0f7-2ac2-4b22-975f-8b2d02c3427f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4061d0f7-2ac2-4b22-975f-8b2d02c3427f
Content-Type: application/json

--- request body ---
{"handle":"qa-044eb5ebc7bb","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4061d0f7-2ac2-4b22-975f-8b2d02c3427f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4061d0f7-2ac2-4b22-975f-8b2d02c3427f"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-36b5ad6c-042d-4a2a-bbf9-984711050db4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36b5ad6c-042d-4a2a-bbf9-984711050db4
Content-Type: application/json

--- request body ---
{"handle":"qa-9b8f13896793","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-36b5ad6c-042d-4a2a-bbf9-984711050db4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_02f8370d-3548-45f9-a5e0-a2a37f15ba77"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff82b2fe-8cdb-47ab-b70b-f66046843a2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff82b2fe-8cdb-47ab-b70b-f66046843a2d
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff82b2fe-8cdb-47ab-b70b-f66046843a2d
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-04461957-9572-4a24-b363-ccfa8bd9205f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04461957-9572-4a24-b363-ccfa8bd9205f
Content-Type: application/json

--- request body ---
{"handle":"qa-9b8f13896793","password":"****"}

--- response: 401 in 35 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04461957-9572-4a24-b363-ccfa8bd9205f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-04461957-9572-4a24-b363-ccfa8bd9205f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c4d73630-f443-458f-9b98-0f34fb8262fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4d73630-f443-458f-9b98-0f34fb8262fe
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c4d73630-f443-458f-9b98-0f34fb8262fe
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-46bef117-bb1d-443e-b812-7f9c4ef826f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46bef117-bb1d-443e-b812-7f9c4ef826f5
Content-Type: application/json

--- request body ---
{"handle":"qa-78bbb295a165","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46bef117-bb1d-443e-b812-7f9c4ef826f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-46bef117-bb1d-443e-b812-7f9c4ef826f5"}
```
