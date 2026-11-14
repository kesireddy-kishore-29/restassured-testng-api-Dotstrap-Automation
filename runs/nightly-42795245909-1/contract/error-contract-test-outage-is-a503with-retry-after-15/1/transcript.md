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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-7bb637cd-da44-4afc-8ae4-49b88b06800d` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-25a9be49-53da-4b3f-a5d0-4d6fa84cd19a` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-5655e173-8416-4e9d-a0f4-e40eb8ad7aa6` |
| 4 | `POST /v1/conversations` | 201 | 5 | `qa-372f8203-0fc3-4846-a3a7-dd3d14db1dae` |
| 5 | `POST /v1/credits/purchases` | 503 | 49 | `qa-bbf740f0-52d4-4906-8434-2cd83e829545` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-a390a07b-35ec-4553-99a9-e973d60892a4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-02ced236-fee4-4b89-80b7-b52d296b5b3d` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-be406380-f1a1-435b-9802-95045a40c318` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-040731ee-ac22-447d-9e8e-15eebcc45f44` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-d866b3e8-5fbf-43f3-97dd-44e8f146315c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7bb637cd-da44-4afc-8ae4-49b88b06800d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bb637cd-da44-4afc-8ae4-49b88b06800d
Content-Type: application/json

--- request body ---
{"handle":"qa-19d608d2b327","displayName":"QA 19d608d2b327","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7bb637cd-da44-4afc-8ae4-49b88b06800d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 7
Location: /v1/accounts/qa-19d608d2b327
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f6cdfae0-f8e0-41bb-8bef-c76d15537ab9","handle":"qa-19d608d2b327","displayName":"QA 19d608d2b327","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.347302627Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-25a9be49-53da-4b3f-a5d0-4d6fa84cd19a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25a9be49-53da-4b3f-a5d0-4d6fa84cd19a
Content-Type: application/json

--- request body ---
{"handle":"qa-1ce262d677da","displayName":"QA 1ce262d677da","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-25a9be49-53da-4b3f-a5d0-4d6fa84cd19a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 7
Location: /v1/accounts/qa-1ce262d677da
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e8c28999-b08c-4c90-9ec3-5d95cda63b5f","handle":"qa-1ce262d677da","displayName":"QA 1ce262d677da","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.378996083Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5655e173-8416-4e9d-a0f4-e40eb8ad7aa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5655e173-8416-4e9d-a0f4-e40eb8ad7aa6
Content-Type: application/json

--- request body ---
{"handle":"qa-19d608d2b327","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-5655e173-8416-4e9d-a0f4-e40eb8ad7aa6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f6cdfae0-f8e0-41bb-8bef-c76d15537ab9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-372f8203-0fc3-4846-a3a7-dd3d14db1dae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-372f8203-0fc3-4846-a3a7-dd3d14db1dae
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1ce262d677da","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-372f8203-0fc3-4846-a3a7-dd3d14db1dae
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
Location: /v1/conversations/cnv_94c1469d-17b0-4162-9207-0ac20a0ab18f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_94c1469d-17b0-4162-9207-0ac20a0ab18f","subject":"Error contract","status":"open","region":"eu","participants":["qa-19d608d2b327","qa-1ce262d677da"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.446907371Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bbf740f0-52d4-4906-8434-2cd83e829545

--- request headers ---
Accept: application/json
Idempotency-Key: qa-73352261db444e469ae981e497cde228
X-Fault-Key: 321b51a2-bf39-4d6e-9f18-2e7fed9a08d2
X-Fault: unavailable-once
X-Correlation-Id: qa-bbf740f0-52d4-4906-8434-2cd83e829545
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 49 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bbf740f0-52d4-4906-8434-2cd83e829545
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-bbf740f0-52d4-4906-8434-2cd83e829545"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a390a07b-35ec-4553-99a9-e973d60892a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a390a07b-35ec-4553-99a9-e973d60892a4
Content-Type: application/json

--- request body ---
{"handle":"qa-1ce262d677da","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a390a07b-35ec-4553-99a9-e973d60892a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e8c28999-b08c-4c90-9ec3-5d95cda63b5f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-02ced236-fee4-4b89-80b7-b52d296b5b3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02ced236-fee4-4b89-80b7-b52d296b5b3d
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-02ced236-fee4-4b89-80b7-b52d296b5b3d
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
correlation: qa-be406380-f1a1-435b-9802-95045a40c318

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be406380-f1a1-435b-9802-95045a40c318
Content-Type: application/json

--- request body ---
{"handle":"qa-1ce262d677da","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be406380-f1a1-435b-9802-95045a40c318
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-be406380-f1a1-435b-9802-95045a40c318"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-040731ee-ac22-447d-9e8e-15eebcc45f44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-040731ee-ac22-447d-9e8e-15eebcc45f44
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-040731ee-ac22-447d-9e8e-15eebcc45f44
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
correlation: qa-d866b3e8-5fbf-43f3-97dd-44e8f146315c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d866b3e8-5fbf-43f3-97dd-44e8f146315c
Content-Type: application/json

--- request body ---
{"handle":"qa-19d608d2b327","password":"****"}

--- response: 401 in 24 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d866b3e8-5fbf-43f3-97dd-44e8f146315c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d866b3e8-5fbf-43f3-97dd-44e8f146315c"}
```
