# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 54 | `qa-bf5d9ad2-e249-4666-ad20-0ecfbded8663` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-4869c68c-6bb3-45e6-ba53-5120c7e72445` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-66957f97-a711-4336-808e-38c6248d1b8a` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-fc78f6c7-0fb2-4e2d-87d2-1b8576f43316` |
| 5 | `PATCH /v1/accounts/me` | 400 | 9 | `qa-54dc5747-7f7e-4462-a22e-f397f2ed80be` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-c4e5e956-0f35-48d1-b27d-a1178d03e003` |
| 7 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-bda1ae0a-ea40-4791-9970-8091a4720e7f` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-5af76ff1-ecbb-4569-95a4-f9924d0b2c30` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-277d9193-b814-438c-8b15-5fdbc9259a51` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-7792a136-5cba-4837-9761-b01167d9b2f1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bf5d9ad2-e249-4666-ad20-0ecfbded8663

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf5d9ad2-e249-4666-ad20-0ecfbded8663
Content-Type: application/json

--- request body ---
{"handle":"qa-653f57b2ed6a","displayName":"QA 653f57b2ed6a","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf5d9ad2-e249-4666-ad20-0ecfbded8663
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Location: /v1/accounts/qa-653f57b2ed6a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b84cb650-0ef5-4b34-a81e-a003780ba580","handle":"qa-653f57b2ed6a","displayName":"QA 653f57b2ed6a","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.899709346Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4869c68c-6bb3-45e6-ba53-5120c7e72445

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4869c68c-6bb3-45e6-ba53-5120c7e72445
Content-Type: application/json

--- request body ---
{"handle":"qa-795b0acb9097","displayName":"QA 795b0acb9097","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4869c68c-6bb3-45e6-ba53-5120c7e72445
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Location: /v1/accounts/qa-795b0acb9097
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7084479d-cd4d-46ba-96f6-aa0345abc392","handle":"qa-795b0acb9097","displayName":"QA 795b0acb9097","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.938595307Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-66957f97-a711-4336-808e-38c6248d1b8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66957f97-a711-4336-808e-38c6248d1b8a
Content-Type: application/json

--- request body ---
{"handle":"qa-653f57b2ed6a","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-66957f97-a711-4336-808e-38c6248d1b8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b84cb650-0ef5-4b34-a81e-a003780ba580"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fc78f6c7-0fb2-4e2d-87d2-1b8576f43316

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc78f6c7-0fb2-4e2d-87d2-1b8576f43316
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-795b0acb9097","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc78f6c7-0fb2-4e2d-87d2-1b8576f43316
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
Location: /v1/conversations/cnv_7ea86e22-b43e-41fa-8659-010120ad9b84
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7ea86e22-b43e-41fa-8659-010120ad9b84","subject":"Error contract","status":"open","region":"eu","participants":["qa-653f57b2ed6a","qa-795b0acb9097"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:58.999998105Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-54dc5747-7f7e-4462-a22e-f397f2ed80be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54dc5747-7f7e-4462-a22e-f397f2ed80be
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 9 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-54dc5747-7f7e-4462-a22e-f397f2ed80be
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-54dc5747-7f7e-4462-a22e-f397f2ed80be"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c4e5e956-0f35-48d1-b27d-a1178d03e003

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4e5e956-0f35-48d1-b27d-a1178d03e003
Content-Type: application/json

--- request body ---
{"handle":"qa-795b0acb9097","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4e5e956-0f35-48d1-b27d-a1178d03e003
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7084479d-cd4d-46ba-96f6-aa0345abc392"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bda1ae0a-ea40-4791-9970-8091a4720e7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bda1ae0a-ea40-4791-9970-8091a4720e7f
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bda1ae0a-ea40-4791-9970-8091a4720e7f
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
correlation: qa-5af76ff1-ecbb-4569-95a4-f9924d0b2c30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5af76ff1-ecbb-4569-95a4-f9924d0b2c30
Content-Type: application/json

--- request body ---
{"handle":"qa-795b0acb9097","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5af76ff1-ecbb-4569-95a4-f9924d0b2c30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5af76ff1-ecbb-4569-95a4-f9924d0b2c30"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-277d9193-b814-438c-8b15-5fdbc9259a51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-277d9193-b814-438c-8b15-5fdbc9259a51
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-277d9193-b814-438c-8b15-5fdbc9259a51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7792a136-5cba-4837-9761-b01167d9b2f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7792a136-5cba-4837-9761-b01167d9b2f1
Content-Type: application/json

--- request body ---
{"handle":"qa-653f57b2ed6a","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7792a136-5cba-4837-9761-b01167d9b2f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7792a136-5cba-4837-9761-b01167d9b2f1"}
```
