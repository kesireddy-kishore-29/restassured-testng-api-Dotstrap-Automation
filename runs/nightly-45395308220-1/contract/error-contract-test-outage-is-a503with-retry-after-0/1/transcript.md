# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-29a38ad6-b804-4804-9153-c0456f295c9f` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-d71b413e-96c2-4436-a573-ec26637b3ad0` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-ed4a0836-669e-45ca-af40-766b4531be3b` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-3dc3915a-1a90-41c4-aad7-6cd254c4b281` |
| 5 | `POST /v1/auth/token` | 503 | 14 | `qa-2b2b701d-2568-4e41-a672-35cd11a3b3e6` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-f8ba0de4-040b-4574-b551-78a70693bf1f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-73d74535-4261-423d-8319-7a9a48e25ffb` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-c27110f0-04ba-4639-accc-00e0a9baa166` |
| 9 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-4f2836a1-c48e-4fdf-9f15-030d93a3e3f1` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-e35f13b7-3790-42bf-b2e2-7ec559629ed8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-29a38ad6-b804-4804-9153-c0456f295c9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29a38ad6-b804-4804-9153-c0456f295c9f
Content-Type: application/json

--- request body ---
{"handle":"qa-a30102b7aa8a","displayName":"QA a30102b7aa8a","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-29a38ad6-b804-4804-9153-c0456f295c9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-a30102b7aa8a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8c2c70f7-2f68-4ecf-b61a-b2085c451e12","handle":"qa-a30102b7aa8a","displayName":"QA a30102b7aa8a","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.135944425Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d71b413e-96c2-4436-a573-ec26637b3ad0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d71b413e-96c2-4436-a573-ec26637b3ad0
Content-Type: application/json

--- request body ---
{"handle":"qa-3dfad77a08ec","displayName":"QA 3dfad77a08ec","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-d71b413e-96c2-4436-a573-ec26637b3ad0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Location: /v1/accounts/qa-3dfad77a08ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_610c48dc-7b47-41d1-9241-c183f7c7c7ca","handle":"qa-3dfad77a08ec","displayName":"QA 3dfad77a08ec","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.214575827Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ed4a0836-669e-45ca-af40-766b4531be3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed4a0836-669e-45ca-af40-766b4531be3b
Content-Type: application/json

--- request body ---
{"handle":"qa-a30102b7aa8a","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed4a0836-669e-45ca-af40-766b4531be3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8c2c70f7-2f68-4ecf-b61a-b2085c451e12"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3dc3915a-1a90-41c4-aad7-6cd254c4b281

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dc3915a-1a90-41c4-aad7-6cd254c4b281
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3dfad77a08ec","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-3dc3915a-1a90-41c4-aad7-6cd254c4b281
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
Location: /v1/conversations/cnv_df66ba25-0c71-4495-9531-81bcaefd79e9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_df66ba25-0c71-4495-9531-81bcaefd79e9","subject":"Error contract","status":"open","region":"eu","participants":["qa-a30102b7aa8a","qa-3dfad77a08ec"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:13.290326664Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2b2b701d-2568-4e41-a672-35cd11a3b3e6

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: db4fe8e3-4336-40c1-9ad3-5a5648df59df
X-Correlation-Id: qa-2b2b701d-2568-4e41-a672-35cd11a3b3e6
Content-Type: application/json

--- request body ---
{"handle":"qa-a30102b7aa8a","password":"****"}

--- response: 503 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b2b701d-2568-4e41-a672-35cd11a3b3e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-2b2b701d-2568-4e41-a672-35cd11a3b3e6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f8ba0de4-040b-4574-b551-78a70693bf1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8ba0de4-040b-4574-b551-78a70693bf1f
Content-Type: application/json

--- request body ---
{"handle":"qa-3dfad77a08ec","password":"****"}

--- response: 200 in 39 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8ba0de4-040b-4574-b551-78a70693bf1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_610c48dc-7b47-41d1-9241-c183f7c7c7ca"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-73d74535-4261-423d-8319-7a9a48e25ffb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73d74535-4261-423d-8319-7a9a48e25ffb
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-73d74535-4261-423d-8319-7a9a48e25ffb
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
correlation: qa-c27110f0-04ba-4639-accc-00e0a9baa166

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c27110f0-04ba-4639-accc-00e0a9baa166
Content-Type: application/json

--- request body ---
{"handle":"qa-3dfad77a08ec","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c27110f0-04ba-4639-accc-00e0a9baa166
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c27110f0-04ba-4639-accc-00e0a9baa166"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f2836a1-c48e-4fdf-9f15-030d93a3e3f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f2836a1-c48e-4fdf-9f15-030d93a3e3f1
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f2836a1-c48e-4fdf-9f15-030d93a3e3f1
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
correlation: qa-e35f13b7-3790-42bf-b2e2-7ec559629ed8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e35f13b7-3790-42bf-b2e2-7ec559629ed8
Content-Type: application/json

--- request body ---
{"handle":"qa-a30102b7aa8a","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e35f13b7-3790-42bf-b2e2-7ec559629ed8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e35f13b7-3790-42bf-b2e2-7ec559629ed8"}
```
