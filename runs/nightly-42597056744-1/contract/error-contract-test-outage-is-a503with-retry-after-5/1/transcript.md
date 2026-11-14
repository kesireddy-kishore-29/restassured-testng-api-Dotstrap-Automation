# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-e201d47f-ee59-4eb6-965b-9b9c867ca7c4` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-153ee9fc-2963-422a-aa97-bb35cbec24e3` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-505859ae-f83c-4613-93d0-0280a3304a6a` |
| 4 | `POST /v1/conversations` | 201 | 3 | `qa-c00fdd54-c42a-446d-9ada-75c4c3017a0a` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 18 | `qa-570e1a95-849f-4db2-b6a0-9d4f13b3b2a6` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-ce2d862f-3dc2-49f4-9179-fc195e8d878c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-fabfe2b2-f132-417a-b149-500b5f51fb89` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-adccb416-3dc6-4975-9b5f-b115aefcd3e5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-aedda78b-6248-4c1b-a608-7a745d578b1b` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-cce84bd1-6de4-400c-aaeb-36612fdae679` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e201d47f-ee59-4eb6-965b-9b9c867ca7c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e201d47f-ee59-4eb6-965b-9b9c867ca7c4
Content-Type: application/json

--- request body ---
{"handle":"qa-7b305f2cb658","displayName":"QA 7b305f2cb658","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e201d47f-ee59-4eb6-965b-9b9c867ca7c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 9
Location: /v1/accounts/qa-7b305f2cb658
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7277fae6-7130-4de7-8430-9d70f95f030e","handle":"qa-7b305f2cb658","displayName":"QA 7b305f2cb658","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.897280087Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-153ee9fc-2963-422a-aa97-bb35cbec24e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-153ee9fc-2963-422a-aa97-bb35cbec24e3
Content-Type: application/json

--- request body ---
{"handle":"qa-3690c03584cc","displayName":"QA 3690c03584cc","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-153ee9fc-2963-422a-aa97-bb35cbec24e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 9
Location: /v1/accounts/qa-3690c03584cc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_01f98af7-bd8a-4871-8ba8-f30e97f29c68","handle":"qa-3690c03584cc","displayName":"QA 3690c03584cc","region":"eu","role":"user","createdAt":"2026-11-09T09:56:02.924686375Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-505859ae-f83c-4613-93d0-0280a3304a6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-505859ae-f83c-4613-93d0-0280a3304a6a
Content-Type: application/json

--- request body ---
{"handle":"qa-7b305f2cb658","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-505859ae-f83c-4613-93d0-0280a3304a6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7277fae6-7130-4de7-8430-9d70f95f030e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c00fdd54-c42a-446d-9ada-75c4c3017a0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c00fdd54-c42a-446d-9ada-75c4c3017a0a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3690c03584cc","subject":"Error contract","message":"Hi"}

--- response: 201 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c00fdd54-c42a-446d-9ada-75c4c3017a0a
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
Location: /v1/conversations/cnv_ea32284f-8945-418c-860d-42e1cc23268e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ea32284f-8945-418c-860d-42e1cc23268e","subject":"Error contract","status":"open","region":"eu","participants":["qa-7b305f2cb658","qa-3690c03584cc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.008925741Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-7b305f2cb658
correlation: qa-570e1a95-849f-4db2-b6a0-9d4f13b3b2a6

--- request headers ---
Accept: application/json
X-Fault-Key: 96d87459-dea3-4ebe-af1c-46987d6a9358
X-Fault: unavailable-once
X-Correlation-Id: qa-570e1a95-849f-4db2-b6a0-9d4f13b3b2a6
Content-Type: application/json

--- response: 503 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-570e1a95-849f-4db2-b6a0-9d4f13b3b2a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-7b305f2cb658","correlationId":"qa-570e1a95-849f-4db2-b6a0-9d4f13b3b2a6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ce2d862f-3dc2-49f4-9179-fc195e8d878c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce2d862f-3dc2-49f4-9179-fc195e8d878c
Content-Type: application/json

--- request body ---
{"handle":"qa-3690c03584cc","password":"****"}

--- response: 200 in 35 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce2d862f-3dc2-49f4-9179-fc195e8d878c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_01f98af7-bd8a-4871-8ba8-f30e97f29c68"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fabfe2b2-f132-417a-b149-500b5f51fb89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fabfe2b2-f132-417a-b149-500b5f51fb89
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fabfe2b2-f132-417a-b149-500b5f51fb89
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
correlation: qa-adccb416-3dc6-4975-9b5f-b115aefcd3e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adccb416-3dc6-4975-9b5f-b115aefcd3e5
Content-Type: application/json

--- request body ---
{"handle":"qa-3690c03584cc","password":"****"}

--- response: 401 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-adccb416-3dc6-4975-9b5f-b115aefcd3e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-adccb416-3dc6-4975-9b5f-b115aefcd3e5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aedda78b-6248-4c1b-a608-7a745d578b1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aedda78b-6248-4c1b-a608-7a745d578b1b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aedda78b-6248-4c1b-a608-7a745d578b1b
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
correlation: qa-cce84bd1-6de4-400c-aaeb-36612fdae679

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cce84bd1-6de4-400c-aaeb-36612fdae679
Content-Type: application/json

--- request body ---
{"handle":"qa-7b305f2cb658","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cce84bd1-6de4-400c-aaeb-36612fdae679
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cce84bd1-6de4-400c-aaeb-36612fdae679"}
```
