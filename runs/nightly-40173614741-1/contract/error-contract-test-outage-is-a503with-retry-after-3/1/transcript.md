# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-c7ac82a0-6bb8-48d9-a085-e74d9c93d83a` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-0e453a16-091f-406a-ba1a-44da33d6f838` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-a361cc9b-485a-41a0-9137-091324f93406` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-8084522e-438a-42cf-b068-5824b8e43948` |
| 5 | `PATCH /v1/accounts/me` | 503 | 25 | `qa-b5557b51-7b52-4740-bcf1-585a2284440b` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-b053bb3c-eed0-415c-a344-a232a91095e4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-40c13cb6-b910-4b3f-98ce-593e4bedf261` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-5a830213-b7af-4be6-a37e-68d4dfcd9034` |
| 9 | `DELETE /v1/accounts/me` | 204 | 46 | `qa-82db467d-adb6-4a77-988a-000ef925f59b` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-444d8af9-6e0c-4c03-bfa6-8c5087fa29da` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c7ac82a0-6bb8-48d9-a085-e74d9c93d83a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7ac82a0-6bb8-48d9-a085-e74d9c93d83a
Content-Type: application/json

--- request body ---
{"handle":"qa-16fc138e0164","displayName":"QA 16fc138e0164","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7ac82a0-6bb8-48d9-a085-e74d9c93d83a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-16fc138e0164
X-Served-Region: eu
Content-Length: 181

{"id":"acc_12c0a9e6-75d2-4ffa-a2b9-0f6dfa8696bc","handle":"qa-16fc138e0164","displayName":"QA 16fc138e0164","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.083692257Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0e453a16-091f-406a-ba1a-44da33d6f838

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e453a16-091f-406a-ba1a-44da33d6f838
Content-Type: application/json

--- request body ---
{"handle":"qa-85eb078ba9b3","displayName":"QA 85eb078ba9b3","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e453a16-091f-406a-ba1a-44da33d6f838
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Location: /v1/accounts/qa-85eb078ba9b3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1a2d30fa-a2f2-4bd4-9364-895ee83b1a96","handle":"qa-85eb078ba9b3","displayName":"QA 85eb078ba9b3","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.144143306Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a361cc9b-485a-41a0-9137-091324f93406

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a361cc9b-485a-41a0-9137-091324f93406
Content-Type: application/json

--- request body ---
{"handle":"qa-16fc138e0164","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-a361cc9b-485a-41a0-9137-091324f93406
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12c0a9e6-75d2-4ffa-a2b9-0f6dfa8696bc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8084522e-438a-42cf-b068-5824b8e43948

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8084522e-438a-42cf-b068-5824b8e43948
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-85eb078ba9b3","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-8084522e-438a-42cf-b068-5824b8e43948
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
Location: /v1/conversations/cnv_b6637867-fc92-4ba2-985b-2f517f8448ee
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b6637867-fc92-4ba2-985b-2f517f8448ee","subject":"Error contract","status":"open","region":"eu","participants":["qa-16fc138e0164","qa-85eb078ba9b3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:24.224044777Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-b5557b51-7b52-4740-bcf1-585a2284440b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 240e86b9-7fc4-4f44-a261-5d4e065a8997
X-Correlation-Id: qa-b5557b51-7b52-4740-bcf1-585a2284440b
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5557b51-7b52-4740-bcf1-585a2284440b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-b5557b51-7b52-4740-bcf1-585a2284440b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b053bb3c-eed0-415c-a344-a232a91095e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b053bb3c-eed0-415c-a344-a232a91095e4
Content-Type: application/json

--- request body ---
{"handle":"qa-85eb078ba9b3","password":"****"}

--- response: 200 in 36 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-b053bb3c-eed0-415c-a344-a232a91095e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1a2d30fa-a2f2-4bd4-9364-895ee83b1a96"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-40c13cb6-b910-4b3f-98ce-593e4bedf261

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40c13cb6-b910-4b3f-98ce-593e4bedf261
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-40c13cb6-b910-4b3f-98ce-593e4bedf261
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
correlation: qa-5a830213-b7af-4be6-a37e-68d4dfcd9034

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a830213-b7af-4be6-a37e-68d4dfcd9034
Content-Type: application/json

--- request body ---
{"handle":"qa-85eb078ba9b3","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a830213-b7af-4be6-a37e-68d4dfcd9034
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5a830213-b7af-4be6-a37e-68d4dfcd9034"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-82db467d-adb6-4a77-988a-000ef925f59b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82db467d-adb6-4a77-988a-000ef925f59b
Content-Type: application/json

--- response: 204 in 46 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-82db467d-adb6-4a77-988a-000ef925f59b
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
correlation: qa-444d8af9-6e0c-4c03-bfa6-8c5087fa29da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-444d8af9-6e0c-4c03-bfa6-8c5087fa29da
Content-Type: application/json

--- request body ---
{"handle":"qa-16fc138e0164","password":"****"}

--- response: 401 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-444d8af9-6e0c-4c03-bfa6-8c5087fa29da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-444d8af9-6e0c-4c03-bfa6-8c5087fa29da"}
```
