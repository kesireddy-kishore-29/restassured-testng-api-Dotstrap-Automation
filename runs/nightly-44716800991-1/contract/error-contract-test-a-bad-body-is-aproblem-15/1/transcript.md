# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-b1206d95-22dd-418e-a35f-9191dad9b052` |
| 2 | `POST /v1/accounts` | 201 | 56 | `qa-c4b30163-13a6-41d9-aa44-6cd32b2b76cc` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-2a598672-84c8-4618-9848-962fb3effb4e` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-79c3c192-6a10-4124-8bf6-ad444c0c426d` |
| 5 | `POST /v1/credits/purchases` | 400 | 9 | `qa-51217c28-ffd7-4353-a630-c55dcdd34547` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-1931c79a-2bd3-44d7-b3d6-14e44aecd07c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-ca943c90-2f38-4f1c-8d35-e412bfb70283` |
| 8 | `POST /v1/auth/token` | 401 | 29 | `qa-7ecf6011-4116-4eee-9d8f-123548cf4647` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-e1fcdcf0-6a6b-414c-af94-d0b18ecc306a` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-67cee052-40fd-4c93-b63e-3a8e2d1801d0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b1206d95-22dd-418e-a35f-9191dad9b052

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1206d95-22dd-418e-a35f-9191dad9b052
Content-Type: application/json

--- request body ---
{"handle":"qa-e9a2a07d33a0","displayName":"QA e9a2a07d33a0","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1206d95-22dd-418e-a35f-9191dad9b052
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
Location: /v1/accounts/qa-e9a2a07d33a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b4278700-8db5-4205-b45c-070f821569ed","handle":"qa-e9a2a07d33a0","displayName":"QA e9a2a07d33a0","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.518419675Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c4b30163-13a6-41d9-aa44-6cd32b2b76cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4b30163-13a6-41d9-aa44-6cd32b2b76cc
Content-Type: application/json

--- request body ---
{"handle":"qa-4ce37c1f9f1d","displayName":"QA 4ce37c1f9f1d","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4b30163-13a6-41d9-aa44-6cd32b2b76cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 6
Location: /v1/accounts/qa-4ce37c1f9f1d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9aba66a9-a764-4afd-a2d6-322facb2716e","handle":"qa-4ce37c1f9f1d","displayName":"QA 4ce37c1f9f1d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.579657639Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2a598672-84c8-4618-9848-962fb3effb4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a598672-84c8-4618-9848-962fb3effb4e
Content-Type: application/json

--- request body ---
{"handle":"qa-e9a2a07d33a0","password":"****"}

--- response: 200 in 41 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a598672-84c8-4618-9848-962fb3effb4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b4278700-8db5-4205-b45c-070f821569ed"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-79c3c192-6a10-4124-8bf6-ad444c0c426d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79c3c192-6a10-4124-8bf6-ad444c0c426d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4ce37c1f9f1d","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-79c3c192-6a10-4124-8bf6-ad444c0c426d
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
Location: /v1/conversations/cnv_eaa54981-5f17-4cc8-b63c-3ca42a129724
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_eaa54981-5f17-4cc8-b63c-3ca42a129724","subject":"Error contract","status":"open","region":"eu","participants":["qa-e9a2a07d33a0","qa-4ce37c1f9f1d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:03.710648259Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-51217c28-ffd7-4353-a630-c55dcdd34547

--- request headers ---
Accept: application/json
Idempotency-Key: qa-80f0bfbf95c54b238cb98a2de8390530
X-Correlation-Id: qa-51217c28-ffd7-4353-a630-c55dcdd34547
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51217c28-ffd7-4353-a630-c55dcdd34547
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-51217c28-ffd7-4353-a630-c55dcdd34547"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1931c79a-2bd3-44d7-b3d6-14e44aecd07c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1931c79a-2bd3-44d7-b3d6-14e44aecd07c
Content-Type: application/json

--- request body ---
{"handle":"qa-4ce37c1f9f1d","password":"****"}

--- response: 200 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1931c79a-2bd3-44d7-b3d6-14e44aecd07c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9aba66a9-a764-4afd-a2d6-322facb2716e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca943c90-2f38-4f1c-8d35-e412bfb70283

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca943c90-2f38-4f1c-8d35-e412bfb70283
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca943c90-2f38-4f1c-8d35-e412bfb70283
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
correlation: qa-7ecf6011-4116-4eee-9d8f-123548cf4647

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ecf6011-4116-4eee-9d8f-123548cf4647
Content-Type: application/json

--- request body ---
{"handle":"qa-4ce37c1f9f1d","password":"****"}

--- response: 401 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ecf6011-4116-4eee-9d8f-123548cf4647
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7ecf6011-4116-4eee-9d8f-123548cf4647"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e1fcdcf0-6a6b-414c-af94-d0b18ecc306a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1fcdcf0-6a6b-414c-af94-d0b18ecc306a
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e1fcdcf0-6a6b-414c-af94-d0b18ecc306a
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
correlation: qa-67cee052-40fd-4c93-b63e-3a8e2d1801d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67cee052-40fd-4c93-b63e-3a8e2d1801d0
Content-Type: application/json

--- request body ---
{"handle":"qa-e9a2a07d33a0","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67cee052-40fd-4c93-b63e-3a8e2d1801d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67cee052-40fd-4c93-b63e-3a8e2d1801d0"}
```
