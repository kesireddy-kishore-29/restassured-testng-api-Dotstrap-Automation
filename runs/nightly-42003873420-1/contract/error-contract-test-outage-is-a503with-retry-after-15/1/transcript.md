# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-ee413652-7fc7-48f4-9aae-16aef332da48` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-4947f9d4-ab20-43cb-bd7f-03b7b31f620a` |
| 3 | `POST /v1/auth/token` | 200 | 92 | `qa-1e3b0523-d585-41f0-9898-20cfc676544c` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-8f16d99c-0435-4b7d-a12b-d6e1065e8cf6` |
| 5 | `POST /v1/credits/purchases` | 503 | 28 | `qa-948c778d-9653-4c8f-819f-7813a1fc1e0f` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-5323ccaa-62a0-4701-abb4-daee436652fc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-db57b990-325d-40c0-b0cc-3aa42cf2e559` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-62c91183-a853-4583-9692-f436e661d9a8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-aeffd550-2651-4614-ae96-0f7815b6d398` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-565db944-2002-454e-8155-252dbf0e4a7c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ee413652-7fc7-48f4-9aae-16aef332da48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee413652-7fc7-48f4-9aae-16aef332da48
Content-Type: application/json

--- request body ---
{"handle":"qa-cab5315c08c2","displayName":"QA cab5315c08c2","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee413652-7fc7-48f4-9aae-16aef332da48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 6
Location: /v1/accounts/qa-cab5315c08c2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b6beab4e-de82-4feb-9a01-9477086d14d4","handle":"qa-cab5315c08c2","displayName":"QA cab5315c08c2","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.710670098Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4947f9d4-ab20-43cb-bd7f-03b7b31f620a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4947f9d4-ab20-43cb-bd7f-03b7b31f620a
Content-Type: application/json

--- request body ---
{"handle":"qa-74126158f81f","displayName":"QA 74126158f81f","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-4947f9d4-ab20-43cb-bd7f-03b7b31f620a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 6
Location: /v1/accounts/qa-74126158f81f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0036b50b-8e63-4c16-9b43-d711ce2344af","handle":"qa-74126158f81f","displayName":"QA 74126158f81f","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.769353848Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1e3b0523-d585-41f0-9898-20cfc676544c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e3b0523-d585-41f0-9898-20cfc676544c
Content-Type: application/json

--- request body ---
{"handle":"qa-cab5315c08c2","password":"****"}

--- response: 200 in 92 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e3b0523-d585-41f0-9898-20cfc676544c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b6beab4e-de82-4feb-9a01-9477086d14d4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8f16d99c-0435-4b7d-a12b-d6e1065e8cf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f16d99c-0435-4b7d-a12b-d6e1065e8cf6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-74126158f81f","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f16d99c-0435-4b7d-a12b-d6e1065e8cf6
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
Location: /v1/conversations/cnv_3cbeceb4-0132-4fea-b473-4163ade707a7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3cbeceb4-0132-4fea-b473-4163ade707a7","subject":"Error contract","status":"open","region":"eu","participants":["qa-cab5315c08c2","qa-74126158f81f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.910819926Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-948c778d-9653-4c8f-819f-7813a1fc1e0f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
Idempotency-Key: qa-e16b167afe514604af84c15f6c0e7e13
X-Fault-Key: 6e50cde6-5a03-4749-924e-8bb5a357519a
X-Correlation-Id: qa-948c778d-9653-4c8f-819f-7813a1fc1e0f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-948c778d-9653-4c8f-819f-7813a1fc1e0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-948c778d-9653-4c8f-819f-7813a1fc1e0f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5323ccaa-62a0-4701-abb4-daee436652fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5323ccaa-62a0-4701-abb4-daee436652fc
Content-Type: application/json

--- request body ---
{"handle":"qa-74126158f81f","password":"****"}

--- response: 200 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5323ccaa-62a0-4701-abb4-daee436652fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0036b50b-8e63-4c16-9b43-d711ce2344af"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-db57b990-325d-40c0-b0cc-3aa42cf2e559

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db57b990-325d-40c0-b0cc-3aa42cf2e559
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-db57b990-325d-40c0-b0cc-3aa42cf2e559
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
correlation: qa-62c91183-a853-4583-9692-f436e661d9a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62c91183-a853-4583-9692-f436e661d9a8
Content-Type: application/json

--- request body ---
{"handle":"qa-74126158f81f","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62c91183-a853-4583-9692-f436e661d9a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-62c91183-a853-4583-9692-f436e661d9a8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aeffd550-2651-4614-ae96-0f7815b6d398

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeffd550-2651-4614-ae96-0f7815b6d398
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aeffd550-2651-4614-ae96-0f7815b6d398
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
correlation: qa-565db944-2002-454e-8155-252dbf0e4a7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-565db944-2002-454e-8155-252dbf0e4a7c
Content-Type: application/json

--- request body ---
{"handle":"qa-cab5315c08c2","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-565db944-2002-454e-8155-252dbf0e4a7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-565db944-2002-454e-8155-252dbf0e4a7c"}
```
