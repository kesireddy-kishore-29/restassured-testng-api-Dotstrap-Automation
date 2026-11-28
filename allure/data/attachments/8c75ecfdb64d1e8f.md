# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-9d1e4197-8541-4738-8156-067fcd640509` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-cc93448e-4479-45c8-9967-120dab6505f1` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-0a28cfad-f5a5-47c0-9b51-6909321cd775` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-b4e00de4-70b6-41e1-bc1e-a91001c4e1ba` |
| 5 | `POST /v1/credits/purchases` | 415 | 11 | `qa-d4450d08-13f7-43dc-9348-8cfdb7c65680` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-e70e6abf-f028-427a-bf7a-c091f6545360` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-46899816-4498-43ef-b741-a524aeb9d33e` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-12c3364e-49c0-4d9f-887a-a97ff48b941e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-f3da79c9-9808-4ef6-9f2f-21abf7d5db64` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-cabc9027-7257-442d-9860-8836a72a9a1d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9d1e4197-8541-4738-8156-067fcd640509

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d1e4197-8541-4738-8156-067fcd640509
Content-Type: application/json

--- request body ---
{"handle":"qa-0e30236d5916","displayName":"QA 0e30236d5916","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d1e4197-8541-4738-8156-067fcd640509
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 6
Location: /v1/accounts/qa-0e30236d5916
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9187b1a2-0e2b-45bf-a94f-21502af638f2","handle":"qa-0e30236d5916","displayName":"QA 0e30236d5916","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.845259757Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cc93448e-4479-45c8-9967-120dab6505f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc93448e-4479-45c8-9967-120dab6505f1
Content-Type: application/json

--- request body ---
{"handle":"qa-34841bbde38e","displayName":"QA 34841bbde38e","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc93448e-4479-45c8-9967-120dab6505f1
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
Location: /v1/accounts/qa-34841bbde38e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4b7043cb-8af0-4705-b604-a8db50a8a658","handle":"qa-34841bbde38e","displayName":"QA 34841bbde38e","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.880254261Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0a28cfad-f5a5-47c0-9b51-6909321cd775

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a28cfad-f5a5-47c0-9b51-6909321cd775
Content-Type: application/json

--- request body ---
{"handle":"qa-0e30236d5916","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a28cfad-f5a5-47c0-9b51-6909321cd775
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9187b1a2-0e2b-45bf-a94f-21502af638f2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b4e00de4-70b6-41e1-bc1e-a91001c4e1ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4e00de4-70b6-41e1-bc1e-a91001c4e1ba
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-34841bbde38e","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4e00de4-70b6-41e1-bc1e-a91001c4e1ba
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
Location: /v1/conversations/cnv_07d0a654-c4a1-41a7-a1e2-e49e77b88b4b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_07d0a654-c4a1-41a7-a1e2-e49e77b88b4b","subject":"Error contract","status":"open","region":"eu","participants":["qa-0e30236d5916","qa-34841bbde38e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.949442200Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d4450d08-13f7-43dc-9348-8cfdb7c65680

--- request headers ---
Accept: application/json
Idempotency-Key: qa-da5c5cf6787940888278b198aeae46c2
X-Correlation-Id: qa-d4450d08-13f7-43dc-9348-8cfdb7c65680
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4450d08-13f7-43dc-9348-8cfdb7c65680
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-d4450d08-13f7-43dc-9348-8cfdb7c65680"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e70e6abf-f028-427a-bf7a-c091f6545360

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e70e6abf-f028-427a-bf7a-c091f6545360
Content-Type: application/json

--- request body ---
{"handle":"qa-34841bbde38e","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-e70e6abf-f028-427a-bf7a-c091f6545360
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4b7043cb-8af0-4705-b604-a8db50a8a658"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-46899816-4498-43ef-b741-a524aeb9d33e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46899816-4498-43ef-b741-a524aeb9d33e
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-46899816-4498-43ef-b741-a524aeb9d33e
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
correlation: qa-12c3364e-49c0-4d9f-887a-a97ff48b941e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12c3364e-49c0-4d9f-887a-a97ff48b941e
Content-Type: application/json

--- request body ---
{"handle":"qa-34841bbde38e","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12c3364e-49c0-4d9f-887a-a97ff48b941e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12c3364e-49c0-4d9f-887a-a97ff48b941e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f3da79c9-9808-4ef6-9f2f-21abf7d5db64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3da79c9-9808-4ef6-9f2f-21abf7d5db64
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f3da79c9-9808-4ef6-9f2f-21abf7d5db64
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
correlation: qa-cabc9027-7257-442d-9860-8836a72a9a1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cabc9027-7257-442d-9860-8836a72a9a1d
Content-Type: application/json

--- request body ---
{"handle":"qa-0e30236d5916","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cabc9027-7257-442d-9860-8836a72a9a1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cabc9027-7257-442d-9860-8836a72a9a1d"}
```
