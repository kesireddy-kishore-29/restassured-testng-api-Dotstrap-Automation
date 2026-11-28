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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-8c02534c-ad47-4268-b17b-000c2145b7ab` |
| 2 | `POST /v1/accounts` | 201 | 71 | `qa-b339cf4a-2991-4545-ab5d-5d8b60749eaf` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-747b4d14-dfb2-4765-bda3-2070d7fc7d64` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-495b02c4-30fc-4272-ba87-5f4ad1a0055b` |
| 5 | `POST /v1/credits/purchases` | 400 | 19 | `qa-0838c888-46eb-493b-87a8-d372651f17b6` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-e886af8b-f508-4f9d-b6ea-aac319f6a7a2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-a9c95628-aadf-4b17-92b8-7427e1897800` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-8d615d0a-785c-46be-a742-1552bac01782` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-4b21fc64-071e-4ac1-984a-6e9356d47c60` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-3d8b8e5c-0018-4d61-954d-905218b53a3e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8c02534c-ad47-4268-b17b-000c2145b7ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c02534c-ad47-4268-b17b-000c2145b7ab
Content-Type: application/json

--- request body ---
{"handle":"qa-f8e10ccc353f","displayName":"QA f8e10ccc353f","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c02534c-ad47-4268-b17b-000c2145b7ab
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
Location: /v1/accounts/qa-f8e10ccc353f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3ad953a0-65c9-4187-b7e5-b60d15d54f79","handle":"qa-f8e10ccc353f","displayName":"QA f8e10ccc353f","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.955041785Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b339cf4a-2991-4545-ab5d-5d8b60749eaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b339cf4a-2991-4545-ab5d-5d8b60749eaf
Content-Type: application/json

--- request body ---
{"handle":"qa-fcfdb4dc1a38","displayName":"QA fcfdb4dc1a38","password":"****","region":"eu"}

--- response: 201 in 71 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b339cf4a-2991-4545-ab5d-5d8b60749eaf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 7
Location: /v1/accounts/qa-fcfdb4dc1a38
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2fe897de-3be2-46b8-860d-afe7dad18877","handle":"qa-fcfdb4dc1a38","displayName":"QA fcfdb4dc1a38","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.058336345Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-747b4d14-dfb2-4765-bda3-2070d7fc7d64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-747b4d14-dfb2-4765-bda3-2070d7fc7d64
Content-Type: application/json

--- request body ---
{"handle":"qa-f8e10ccc353f","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-747b4d14-dfb2-4765-bda3-2070d7fc7d64
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ad953a0-65c9-4187-b7e5-b60d15d54f79"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-495b02c4-30fc-4272-ba87-5f4ad1a0055b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-495b02c4-30fc-4272-ba87-5f4ad1a0055b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fcfdb4dc1a38","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-495b02c4-30fc-4272-ba87-5f4ad1a0055b
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
Location: /v1/conversations/cnv_2d103382-a295-4e1b-8555-453e864b1f37
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2d103382-a295-4e1b-8555-453e864b1f37","subject":"Error contract","status":"open","region":"eu","participants":["qa-f8e10ccc353f","qa-fcfdb4dc1a38"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:55:00.126686103Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0838c888-46eb-493b-87a8-d372651f17b6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a3bb2fbc0cbf49bf94515d413297b0ff
X-Correlation-Id: qa-0838c888-46eb-493b-87a8-d372651f17b6
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 19 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0838c888-46eb-493b-87a8-d372651f17b6
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-0838c888-46eb-493b-87a8-d372651f17b6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e886af8b-f508-4f9d-b6ea-aac319f6a7a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e886af8b-f508-4f9d-b6ea-aac319f6a7a2
Content-Type: application/json

--- request body ---
{"handle":"qa-fcfdb4dc1a38","password":"****"}

--- response: 200 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-e886af8b-f508-4f9d-b6ea-aac319f6a7a2
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fe897de-3be2-46b8-860d-afe7dad18877"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a9c95628-aadf-4b17-92b8-7427e1897800

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9c95628-aadf-4b17-92b8-7427e1897800
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a9c95628-aadf-4b17-92b8-7427e1897800
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
correlation: qa-8d615d0a-785c-46be-a742-1552bac01782

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d615d0a-785c-46be-a742-1552bac01782
Content-Type: application/json

--- request body ---
{"handle":"qa-fcfdb4dc1a38","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d615d0a-785c-46be-a742-1552bac01782
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8d615d0a-785c-46be-a742-1552bac01782"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4b21fc64-071e-4ac1-984a-6e9356d47c60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b21fc64-071e-4ac1-984a-6e9356d47c60
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4b21fc64-071e-4ac1-984a-6e9356d47c60
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
correlation: qa-3d8b8e5c-0018-4d61-954d-905218b53a3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d8b8e5c-0018-4d61-954d-905218b53a3e
Content-Type: application/json

--- request body ---
{"handle":"qa-f8e10ccc353f","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d8b8e5c-0018-4d61-954d-905218b53a3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d8b8e5c-0018-4d61-954d-905218b53a3e"}
```
