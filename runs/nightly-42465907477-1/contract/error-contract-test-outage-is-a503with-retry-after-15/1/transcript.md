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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-2fbc5fe1-ae93-454d-bc9a-cfe08b98bbc8` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-74478541-20cb-48c2-bb0e-ae593a8d96ab` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-880fcce8-8a05-4d0d-b390-672e48c88be4` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-f3fae601-ee8e-4de6-b084-9032ea66cc7c` |
| 5 | `POST /v1/credits/purchases` | 503 | 13 | `qa-53ae9fc6-d4ad-4b31-a46c-55427fdfb8fb` |
| 6 | `POST /v1/auth/token` | 200 | 7 | `qa-17d43ea8-a726-4254-8814-995ce2990517` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-afc582d2-3940-46af-8e71-2e20bd031c31` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-5692cee1-5ecc-408c-986f-4fbcec18542f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-643f8237-00ea-402f-90ab-2d5cc9c080c8` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-70a69b5e-f25e-4244-8cd8-ae7bb126b6c9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2fbc5fe1-ae93-454d-bc9a-cfe08b98bbc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fbc5fe1-ae93-454d-bc9a-cfe08b98bbc8
Content-Type: application/json

--- request body ---
{"handle":"qa-097b8403e341","displayName":"QA 097b8403e341","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fbc5fe1-ae93-454d-bc9a-cfe08b98bbc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 8
Location: /v1/accounts/qa-097b8403e341
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f63f98a-c9bc-437c-a9df-8bdc9a688168","handle":"qa-097b8403e341","displayName":"QA 097b8403e341","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.436922028Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-74478541-20cb-48c2-bb0e-ae593a8d96ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74478541-20cb-48c2-bb0e-ae593a8d96ab
Content-Type: application/json

--- request body ---
{"handle":"qa-b1dee617d988","displayName":"QA b1dee617d988","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-74478541-20cb-48c2-bb0e-ae593a8d96ab
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
Location: /v1/accounts/qa-b1dee617d988
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8bdffcb0-0680-46d2-8e6f-c7ffaf028ad8","handle":"qa-b1dee617d988","displayName":"QA b1dee617d988","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.462110794Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-880fcce8-8a05-4d0d-b390-672e48c88be4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-880fcce8-8a05-4d0d-b390-672e48c88be4
Content-Type: application/json

--- request body ---
{"handle":"qa-097b8403e341","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-880fcce8-8a05-4d0d-b390-672e48c88be4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7f63f98a-c9bc-437c-a9df-8bdc9a688168"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f3fae601-ee8e-4de6-b084-9032ea66cc7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3fae601-ee8e-4de6-b084-9032ea66cc7c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b1dee617d988","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3fae601-ee8e-4de6-b084-9032ea66cc7c
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
Location: /v1/conversations/cnv_332d053f-274b-4987-819e-a3d81bd5caa4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_332d053f-274b-4987-819e-a3d81bd5caa4","subject":"Error contract","status":"open","region":"eu","participants":["qa-097b8403e341","qa-b1dee617d988"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.493300121Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-53ae9fc6-d4ad-4b31-a46c-55427fdfb8fb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cc71e5004bfc468ab83a5718e047a980
X-Fault-Key: 5d2246cb-456c-4f46-9fb5-3d3d2bd0eab2
X-Fault: unavailable-once
X-Correlation-Id: qa-53ae9fc6-d4ad-4b31-a46c-55427fdfb8fb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53ae9fc6-d4ad-4b31-a46c-55427fdfb8fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-53ae9fc6-d4ad-4b31-a46c-55427fdfb8fb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-17d43ea8-a726-4254-8814-995ce2990517

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17d43ea8-a726-4254-8814-995ce2990517
Content-Type: application/json

--- request body ---
{"handle":"qa-b1dee617d988","password":"****"}

--- response: 200 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-17d43ea8-a726-4254-8814-995ce2990517
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8bdffcb0-0680-46d2-8e6f-c7ffaf028ad8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-afc582d2-3940-46af-8e71-2e20bd031c31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afc582d2-3940-46af-8e71-2e20bd031c31
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-afc582d2-3940-46af-8e71-2e20bd031c31
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
correlation: qa-5692cee1-5ecc-408c-986f-4fbcec18542f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5692cee1-5ecc-408c-986f-4fbcec18542f
Content-Type: application/json

--- request body ---
{"handle":"qa-b1dee617d988","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5692cee1-5ecc-408c-986f-4fbcec18542f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5692cee1-5ecc-408c-986f-4fbcec18542f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-643f8237-00ea-402f-90ab-2d5cc9c080c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-643f8237-00ea-402f-90ab-2d5cc9c080c8
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-643f8237-00ea-402f-90ab-2d5cc9c080c8
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
correlation: qa-70a69b5e-f25e-4244-8cd8-ae7bb126b6c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70a69b5e-f25e-4244-8cd8-ae7bb126b6c9
Content-Type: application/json

--- request body ---
{"handle":"qa-097b8403e341","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70a69b5e-f25e-4244-8cd8-ae7bb126b6c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-70a69b5e-f25e-4244-8cd8-ae7bb126b6c9"}
```
