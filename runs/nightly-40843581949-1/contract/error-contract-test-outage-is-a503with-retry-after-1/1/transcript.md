# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 497 | `qa-e5e42e64-00ed-4f02-be74-124985a030ee` |
| 2 | `POST /v1/accounts` | 201 | 77 | `qa-3a13b277-7e74-4aaa-84a1-cd0b212499c4` |
| 3 | `POST /v1/auth/token` | 200 | 91 | `qa-f66c6a12-8fea-4db4-b9ec-c447230c53ef` |
| 4 | `POST /v1/conversations` | 201 | 73 | `qa-c142fa0c-f4e6-4b38-b453-2ce5e67d1e03` |
| 5 | `POST /v1/accounts` | 503 | 30 | `qa-d0d3861e-b448-4bb2-a0f8-0da4ae992d9f` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-485ff901-639a-4b66-afec-3e21ca86a45e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-9a564fd5-3081-4295-9ad7-a3fce1297c2f` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-59dd622a-6410-492f-acfc-2b3d7fc056c6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-c02c77cf-13ff-4d42-809a-86462abc7e43` |
| 10 | `POST /v1/auth/token` | 401 | 48 | `qa-6524d625-36af-4136-9c7d-cf2454d293ec` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e5e42e64-00ed-4f02-be74-124985a030ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5e42e64-00ed-4f02-be74-124985a030ee
Content-Type: application/json

--- request body ---
{"handle":"qa-35f5db78f2ed","displayName":"QA 35f5db78f2ed","password":"****","region":"eu"}

--- response: 201 in 497 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5e42e64-00ed-4f02-be74-124985a030ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Location: /v1/accounts/qa-35f5db78f2ed
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fa704a27-8bd0-4ad0-9abf-59f3435cd0bd","handle":"qa-35f5db78f2ed","displayName":"QA 35f5db78f2ed","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.634850970Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a13b277-7e74-4aaa-84a1-cd0b212499c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a13b277-7e74-4aaa-84a1-cd0b212499c4
Content-Type: application/json

--- request body ---
{"handle":"qa-8ab1a7c11e07","displayName":"QA 8ab1a7c11e07","password":"****","region":"eu"}

--- response: 201 in 77 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a13b277-7e74-4aaa-84a1-cd0b212499c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-8ab1a7c11e07
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff416f46-8d9b-4065-8fa6-217751f3cec2","handle":"qa-8ab1a7c11e07","displayName":"QA 8ab1a7c11e07","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.153265015Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f66c6a12-8fea-4db4-b9ec-c447230c53ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f66c6a12-8fea-4db4-b9ec-c447230c53ef
Content-Type: application/json

--- request body ---
{"handle":"qa-35f5db78f2ed","password":"****"}

--- response: 200 in 91 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f66c6a12-8fea-4db4-b9ec-c447230c53ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fa704a27-8bd0-4ad0-9abf-59f3435cd0bd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c142fa0c-f4e6-4b38-b453-2ce5e67d1e03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c142fa0c-f4e6-4b38-b453-2ce5e67d1e03
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8ab1a7c11e07","subject":"Error contract","message":"Hi"}

--- response: 201 in 73 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c142fa0c-f4e6-4b38-b453-2ce5e67d1e03
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
Location: /v1/conversations/cnv_0ba9cb15-b454-48b7-98e8-5c12783b2c14
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0ba9cb15-b454-48b7-98e8-5c12783b2c14","subject":"Error contract","status":"open","region":"eu","participants":["qa-35f5db78f2ed","qa-8ab1a7c11e07"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:58.459422861Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-d0d3861e-b448-4bb2-a0f8-0da4ae992d9f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 929e88e8-8581-40ca-9fc2-f5a345ec62f0
X-Correlation-Id: qa-d0d3861e-b448-4bb2-a0f8-0da4ae992d9f
Content-Type: application/json

--- request body ---
{"handle":"qa-cee3dc57c77e","displayName":"QA cee3dc57c77e","password":"****","region":"eu"}

--- response: 503 in 30 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0d3861e-b448-4bb2-a0f8-0da4ae992d9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-d0d3861e-b448-4bb2-a0f8-0da4ae992d9f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-485ff901-639a-4b66-afec-3e21ca86a45e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-485ff901-639a-4b66-afec-3e21ca86a45e
Content-Type: application/json

--- request body ---
{"handle":"qa-8ab1a7c11e07","password":"****"}

--- response: 200 in 37 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-485ff901-639a-4b66-afec-3e21ca86a45e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ff416f46-8d9b-4065-8fa6-217751f3cec2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9a564fd5-3081-4295-9ad7-a3fce1297c2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a564fd5-3081-4295-9ad7-a3fce1297c2f
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9a564fd5-3081-4295-9ad7-a3fce1297c2f
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
correlation: qa-59dd622a-6410-492f-acfc-2b3d7fc056c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59dd622a-6410-492f-acfc-2b3d7fc056c6
Content-Type: application/json

--- request body ---
{"handle":"qa-8ab1a7c11e07","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59dd622a-6410-492f-acfc-2b3d7fc056c6
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-59dd622a-6410-492f-acfc-2b3d7fc056c6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c02c77cf-13ff-4d42-809a-86462abc7e43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c02c77cf-13ff-4d42-809a-86462abc7e43
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c02c77cf-13ff-4d42-809a-86462abc7e43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-6524d625-36af-4136-9c7d-cf2454d293ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6524d625-36af-4136-9c7d-cf2454d293ec
Content-Type: application/json

--- request body ---
{"handle":"qa-35f5db78f2ed","password":"****"}

--- response: 401 in 48 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6524d625-36af-4136-9c7d-cf2454d293ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6524d625-36af-4136-9c7d-cf2454d293ec"}
```
