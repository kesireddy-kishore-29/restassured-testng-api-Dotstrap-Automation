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
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-f5ff4c81-8732-4538-be55-2959baba28e4` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-4c71c5ef-bd69-4171-8e65-3ae3fa63378d` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-bf12eb58-df58-40c6-b878-d6adfd45c70f` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-c228895f-f104-4e18-80e9-0d218d11b724` |
| 5 | `POST /v1/accounts` | 503 | 18 | `qa-da419ef5-c778-483b-a3f6-78fae9120a8c` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-0927331f-ccd1-4b42-a161-260f3d24f15f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-9a731465-36ed-4131-ad7e-e61177925be8` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-7ebe2225-1e77-4559-8375-96a8a93f0543` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-a3522b30-8d05-4457-b3b7-8d1b2c235e98` |
| 10 | `POST /v1/auth/token` | 401 | 33 | `qa-2a68fdcd-38a2-467d-bee3-a42a985a881f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f5ff4c81-8732-4538-be55-2959baba28e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5ff4c81-8732-4538-be55-2959baba28e4
Content-Type: application/json

--- request body ---
{"handle":"qa-9f1441f41a96","displayName":"QA 9f1441f41a96","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5ff4c81-8732-4538-be55-2959baba28e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-9f1441f41a96
X-Served-Region: eu
Content-Length: 181

{"id":"acc_85424be0-ae01-4f68-bc28-1b29773494ff","handle":"qa-9f1441f41a96","displayName":"QA 9f1441f41a96","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.856994149Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4c71c5ef-bd69-4171-8e65-3ae3fa63378d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c71c5ef-bd69-4171-8e65-3ae3fa63378d
Content-Type: application/json

--- request body ---
{"handle":"qa-d56252f5668b","displayName":"QA d56252f5668b","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c71c5ef-bd69-4171-8e65-3ae3fa63378d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Location: /v1/accounts/qa-d56252f5668b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_20be1346-3e01-4b30-a09d-216be05a0f99","handle":"qa-d56252f5668b","displayName":"QA d56252f5668b","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.901569463Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bf12eb58-df58-40c6-b878-d6adfd45c70f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf12eb58-df58-40c6-b878-d6adfd45c70f
Content-Type: application/json

--- request body ---
{"handle":"qa-9f1441f41a96","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf12eb58-df58-40c6-b878-d6adfd45c70f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_85424be0-ae01-4f68-bc28-1b29773494ff"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c228895f-f104-4e18-80e9-0d218d11b724

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c228895f-f104-4e18-80e9-0d218d11b724
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d56252f5668b","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c228895f-f104-4e18-80e9-0d218d11b724
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
Location: /v1/conversations/cnv_16fcf7d3-0f7f-4e1c-bb21-44ee4a0d83ce
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_16fcf7d3-0f7f-4e1c-bb21-44ee4a0d83ce","subject":"Error contract","status":"open","region":"eu","participants":["qa-9f1441f41a96","qa-d56252f5668b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:01.971716530Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-da419ef5-c778-483b-a3f6-78fae9120a8c

--- request headers ---
Accept: application/json
X-Fault-Key: a9076608-e171-4a31-a0e5-fcea65f037a9
X-Fault: unavailable-once
X-Correlation-Id: qa-da419ef5-c778-483b-a3f6-78fae9120a8c
Content-Type: application/json

--- request body ---
{"handle":"qa-10b746921a4e","displayName":"QA 10b746921a4e","password":"****","region":"eu"}

--- response: 503 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da419ef5-c778-483b-a3f6-78fae9120a8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-da419ef5-c778-483b-a3f6-78fae9120a8c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0927331f-ccd1-4b42-a161-260f3d24f15f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0927331f-ccd1-4b42-a161-260f3d24f15f
Content-Type: application/json

--- request body ---
{"handle":"qa-d56252f5668b","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0927331f-ccd1-4b42-a161-260f3d24f15f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_20be1346-3e01-4b30-a09d-216be05a0f99"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9a731465-36ed-4131-ad7e-e61177925be8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a731465-36ed-4131-ad7e-e61177925be8
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9a731465-36ed-4131-ad7e-e61177925be8
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
correlation: qa-7ebe2225-1e77-4559-8375-96a8a93f0543

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ebe2225-1e77-4559-8375-96a8a93f0543
Content-Type: application/json

--- request body ---
{"handle":"qa-d56252f5668b","password":"****"}

--- response: 401 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ebe2225-1e77-4559-8375-96a8a93f0543
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7ebe2225-1e77-4559-8375-96a8a93f0543"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a3522b30-8d05-4457-b3b7-8d1b2c235e98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3522b30-8d05-4457-b3b7-8d1b2c235e98
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a3522b30-8d05-4457-b3b7-8d1b2c235e98
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
correlation: qa-2a68fdcd-38a2-467d-bee3-a42a985a881f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a68fdcd-38a2-467d-bee3-a42a985a881f
Content-Type: application/json

--- request body ---
{"handle":"qa-9f1441f41a96","password":"****"}

--- response: 401 in 33 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a68fdcd-38a2-467d-bee3-a42a985a881f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2a68fdcd-38a2-467d-bee3-a42a985a881f"}
```
