# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-c1aafcc4-0066-4f50-8ba2-2d426c118465` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-68ab0cc0-435b-4449-b78a-2cc1fa4b7264` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-ab644aca-bb82-4315-9df7-ce8dd8ca02ba` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-1a53091e-c512-4583-a284-18a6c158c623` |
| 5 | `POST /v1/conversations` | 422 | 10 | `qa-e9a0ff1a-d5db-4af9-8351-ff143c2a5037` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-b896860e-3623-4efd-9f66-865c25d56f6a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-0a4d24f3-ed64-410f-b1f1-e08330fb9556` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-ef32311f-d31f-4932-8a71-3c22be6dc0c7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-0a3bc4d6-e297-41f7-8c34-b9ef2fd5b94d` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-7168f363-1e69-47b5-b4b2-f5220d714327` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c1aafcc4-0066-4f50-8ba2-2d426c118465

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1aafcc4-0066-4f50-8ba2-2d426c118465
Content-Type: application/json

--- request body ---
{"handle":"qa-a040a436e7e3","displayName":"QA a040a436e7e3","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1aafcc4-0066-4f50-8ba2-2d426c118465
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Location: /v1/accounts/qa-a040a436e7e3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0c348100-049e-45f2-9889-e0cf8160b252","handle":"qa-a040a436e7e3","displayName":"QA a040a436e7e3","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.801653753Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-68ab0cc0-435b-4449-b78a-2cc1fa4b7264

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68ab0cc0-435b-4449-b78a-2cc1fa4b7264
Content-Type: application/json

--- request body ---
{"handle":"qa-4374f971764f","displayName":"QA 4374f971764f","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-68ab0cc0-435b-4449-b78a-2cc1fa4b7264
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Location: /v1/accounts/qa-4374f971764f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b695feb9-67b7-470e-80c0-f9d2970db4e8","handle":"qa-4374f971764f","displayName":"QA 4374f971764f","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.829880532Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ab644aca-bb82-4315-9df7-ce8dd8ca02ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab644aca-bb82-4315-9df7-ce8dd8ca02ba
Content-Type: application/json

--- request body ---
{"handle":"qa-a040a436e7e3","password":"****"}

--- response: 200 in 37 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab644aca-bb82-4315-9df7-ce8dd8ca02ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0c348100-049e-45f2-9889-e0cf8160b252"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1a53091e-c512-4583-a284-18a6c158c623

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a53091e-c512-4583-a284-18a6c158c623
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4374f971764f","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a53091e-c512-4583-a284-18a6c158c623
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
Location: /v1/conversations/cnv_d49cc598-0d33-4ca6-a489-832dffe0415a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d49cc598-0d33-4ca6-a489-832dffe0415a","subject":"Error contract","status":"open","region":"eu","participants":["qa-a040a436e7e3","qa-4374f971764f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.909124332Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-e9a0ff1a-d5db-4af9-8351-ff143c2a5037

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9a0ff1a-d5db-4af9-8351-ff143c2a5037
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4374f971764f","subject":" ","message":"Hi"}

--- response: 422 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9a0ff1a-d5db-4af9-8351-ff143c2a5037
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-e9a0ff1a-d5db-4af9-8351-ff143c2a5037","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b896860e-3623-4efd-9f66-865c25d56f6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b896860e-3623-4efd-9f66-865c25d56f6a
Content-Type: application/json

--- request body ---
{"handle":"qa-4374f971764f","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b896860e-3623-4efd-9f66-865c25d56f6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b695feb9-67b7-470e-80c0-f9d2970db4e8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0a4d24f3-ed64-410f-b1f1-e08330fb9556

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a4d24f3-ed64-410f-b1f1-e08330fb9556
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0a4d24f3-ed64-410f-b1f1-e08330fb9556
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
correlation: qa-ef32311f-d31f-4932-8a71-3c22be6dc0c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef32311f-d31f-4932-8a71-3c22be6dc0c7
Content-Type: application/json

--- request body ---
{"handle":"qa-4374f971764f","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef32311f-d31f-4932-8a71-3c22be6dc0c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ef32311f-d31f-4932-8a71-3c22be6dc0c7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0a3bc4d6-e297-41f7-8c34-b9ef2fd5b94d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a3bc4d6-e297-41f7-8c34-b9ef2fd5b94d
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0a3bc4d6-e297-41f7-8c34-b9ef2fd5b94d
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
correlation: qa-7168f363-1e69-47b5-b4b2-f5220d714327

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7168f363-1e69-47b5-b4b2-f5220d714327
Content-Type: application/json

--- request body ---
{"handle":"qa-a040a436e7e3","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7168f363-1e69-47b5-b4b2-f5220d714327
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7168f363-1e69-47b5-b4b2-f5220d714327"}
```
