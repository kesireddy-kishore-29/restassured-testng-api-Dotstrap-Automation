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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-6e9e11dc-258a-46b8-933c-9c76eaad52af` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-d9bbcdcc-b69f-4d66-98f9-1d8a5158c97a` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-85d2d1c6-a199-4555-869f-4e088f8a6398` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-290ac67c-e5d9-4d7c-ab0b-74214e10921a` |
| 5 | `POST /v1/credits/purchases` | 503 | 16 | `qa-8f002b05-bff4-47ca-9016-54b17c3a6b21` |
| 6 | `POST /v1/auth/token` | 200 | 50 | `qa-29807037-68dc-4211-8f6f-9a9c1a8c3e72` |
| 7 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-62b601df-d20b-491e-a4bc-0233f25c3330` |
| 8 | `POST /v1/auth/token` | 401 | 34 | `qa-4ec84a4d-94e9-48b6-8f02-6507681df031` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-6f0bdae7-99b5-423e-bc9f-864941bac266` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-e812ded5-5f2e-488b-9aa8-06718834c076` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6e9e11dc-258a-46b8-933c-9c76eaad52af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e9e11dc-258a-46b8-933c-9c76eaad52af
Content-Type: application/json

--- request body ---
{"handle":"qa-83d245c2f1e9","displayName":"QA 83d245c2f1e9","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e9e11dc-258a-46b8-933c-9c76eaad52af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 6
Location: /v1/accounts/qa-83d245c2f1e9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_211028f7-9a66-46c4-b3ce-9041b5357529","handle":"qa-83d245c2f1e9","displayName":"QA 83d245c2f1e9","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.088611079Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d9bbcdcc-b69f-4d66-98f9-1d8a5158c97a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9bbcdcc-b69f-4d66-98f9-1d8a5158c97a
Content-Type: application/json

--- request body ---
{"handle":"qa-783e234aa67e","displayName":"QA 783e234aa67e","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9bbcdcc-b69f-4d66-98f9-1d8a5158c97a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 6
Location: /v1/accounts/qa-783e234aa67e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b9c545f6-3afc-4ee7-b5a2-1879f3b58430","handle":"qa-783e234aa67e","displayName":"QA 783e234aa67e","region":"eu","role":"user","createdAt":"2026-11-21T09:57:12.161378462Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-85d2d1c6-a199-4555-869f-4e088f8a6398

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85d2d1c6-a199-4555-869f-4e088f8a6398
Content-Type: application/json

--- request body ---
{"handle":"qa-83d245c2f1e9","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-85d2d1c6-a199-4555-869f-4e088f8a6398
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_211028f7-9a66-46c4-b3ce-9041b5357529"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-290ac67c-e5d9-4d7c-ab0b-74214e10921a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-290ac67c-e5d9-4d7c-ab0b-74214e10921a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-783e234aa67e","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-290ac67c-e5d9-4d7c-ab0b-74214e10921a
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
Location: /v1/conversations/cnv_c88f0b88-bb57-46ea-ac48-53681e2beec2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c88f0b88-bb57-46ea-ac48-53681e2beec2","subject":"Error contract","status":"open","region":"eu","participants":["qa-83d245c2f1e9","qa-783e234aa67e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:12.270279118Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8f002b05-bff4-47ca-9016-54b17c3a6b21

--- request headers ---
Accept: application/json
X-Fault-Key: 86b4d190-2454-4060-993f-3baa81672c0c
Idempotency-Key: qa-2beae2cdc68b4835af63c6ad923ef221
X-Fault: unavailable-once
X-Correlation-Id: qa-8f002b05-bff4-47ca-9016-54b17c3a6b21
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f002b05-bff4-47ca-9016-54b17c3a6b21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-8f002b05-bff4-47ca-9016-54b17c3a6b21"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-29807037-68dc-4211-8f6f-9a9c1a8c3e72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29807037-68dc-4211-8f6f-9a9c1a8c3e72
Content-Type: application/json

--- request body ---
{"handle":"qa-783e234aa67e","password":"****"}

--- response: 200 in 50 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-29807037-68dc-4211-8f6f-9a9c1a8c3e72
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b9c545f6-3afc-4ee7-b5a2-1879f3b58430"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-62b601df-d20b-491e-a4bc-0233f25c3330

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62b601df-d20b-491e-a4bc-0233f25c3330
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-62b601df-d20b-491e-a4bc-0233f25c3330
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
correlation: qa-4ec84a4d-94e9-48b6-8f02-6507681df031

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ec84a4d-94e9-48b6-8f02-6507681df031
Content-Type: application/json

--- request body ---
{"handle":"qa-783e234aa67e","password":"****"}

--- response: 401 in 34 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ec84a4d-94e9-48b6-8f02-6507681df031
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4ec84a4d-94e9-48b6-8f02-6507681df031"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f0bdae7-99b5-423e-bc9f-864941bac266

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f0bdae7-99b5-423e-bc9f-864941bac266
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f0bdae7-99b5-423e-bc9f-864941bac266
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
correlation: qa-e812ded5-5f2e-488b-9aa8-06718834c076

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e812ded5-5f2e-488b-9aa8-06718834c076
Content-Type: application/json

--- request body ---
{"handle":"qa-83d245c2f1e9","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e812ded5-5f2e-488b-9aa8-06718834c076
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e812ded5-5f2e-488b-9aa8-06718834c076"}
```
