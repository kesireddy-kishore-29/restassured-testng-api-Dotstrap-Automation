# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-b8137e6a-c639-4bd8-ad89-e06461e7b046` |
| 2 | `POST /v1/accounts` | 201 | 64 | `qa-c73a9598-3d4b-4bbd-a386-808d6d3f43e0` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-814812e4-a9a3-4b4a-a3d3-2e0478204e65` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-f86b7200-6a11-4c0e-93f7-d842e77474cd` |
| 5 | `POST /v1/accounts` | 415 | 12 | `qa-f13a3ad8-8aab-4e40-a6bd-b19d7c37b7d4` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-34478176-9831-4e0f-8cb2-b536db6839bf` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-4d318a70-4f53-45ed-9369-75b0671995af` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-84f99672-fdc6-4931-856b-5b319abcf494` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-e386e462-a46e-4889-a23f-f895de06805a` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-6fcbc8fb-0e1c-4d50-987d-36b9578afc67` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b8137e6a-c639-4bd8-ad89-e06461e7b046

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8137e6a-c639-4bd8-ad89-e06461e7b046
Content-Type: application/json

--- request body ---
{"handle":"qa-76d31ecdf41b","displayName":"QA 76d31ecdf41b","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8137e6a-c639-4bd8-ad89-e06461e7b046
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 9
Location: /v1/accounts/qa-76d31ecdf41b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_13a5f291-5001-494c-9c4d-7afd8d6a8bfb","handle":"qa-76d31ecdf41b","displayName":"QA 76d31ecdf41b","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.312252010Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c73a9598-3d4b-4bbd-a386-808d6d3f43e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c73a9598-3d4b-4bbd-a386-808d6d3f43e0
Content-Type: application/json

--- request body ---
{"handle":"qa-a76107d29e15","displayName":"QA a76107d29e15","password":"****","region":"eu"}

--- response: 201 in 64 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c73a9598-3d4b-4bbd-a386-808d6d3f43e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 9
Location: /v1/accounts/qa-a76107d29e15
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f8cc1d36-2e8c-4461-bfed-746ddaac5b74","handle":"qa-a76107d29e15","displayName":"QA a76107d29e15","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.382067432Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-814812e4-a9a3-4b4a-a3d3-2e0478204e65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-814812e4-a9a3-4b4a-a3d3-2e0478204e65
Content-Type: application/json

--- request body ---
{"handle":"qa-76d31ecdf41b","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-814812e4-a9a3-4b4a-a3d3-2e0478204e65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_13a5f291-5001-494c-9c4d-7afd8d6a8bfb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f86b7200-6a11-4c0e-93f7-d842e77474cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f86b7200-6a11-4c0e-93f7-d842e77474cd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a76107d29e15","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-f86b7200-6a11-4c0e-93f7-d842e77474cd
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
Location: /v1/conversations/cnv_e6d6e999-3eb4-46e8-b8da-cae8a3ed91a2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e6d6e999-3eb4-46e8-b8da-cae8a3ed91a2","subject":"Error contract","status":"open","region":"eu","participants":["qa-76d31ecdf41b","qa-a76107d29e15"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.506327464Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-f13a3ad8-8aab-4e40-a6bd-b19d7c37b7d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f13a3ad8-8aab-4e40-a6bd-b19d7c37b7d4
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f13a3ad8-8aab-4e40-a6bd-b19d7c37b7d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 9
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-f13a3ad8-8aab-4e40-a6bd-b19d7c37b7d4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-34478176-9831-4e0f-8cb2-b536db6839bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34478176-9831-4e0f-8cb2-b536db6839bf
Content-Type: application/json

--- request body ---
{"handle":"qa-a76107d29e15","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-34478176-9831-4e0f-8cb2-b536db6839bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f8cc1d36-2e8c-4461-bfed-746ddaac5b74"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4d318a70-4f53-45ed-9369-75b0671995af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d318a70-4f53-45ed-9369-75b0671995af
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4d318a70-4f53-45ed-9369-75b0671995af
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
correlation: qa-84f99672-fdc6-4931-856b-5b319abcf494

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84f99672-fdc6-4931-856b-5b319abcf494
Content-Type: application/json

--- request body ---
{"handle":"qa-a76107d29e15","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84f99672-fdc6-4931-856b-5b319abcf494
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-84f99672-fdc6-4931-856b-5b319abcf494"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e386e462-a46e-4889-a23f-f895de06805a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e386e462-a46e-4889-a23f-f895de06805a
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e386e462-a46e-4889-a23f-f895de06805a
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
correlation: qa-6fcbc8fb-0e1c-4d50-987d-36b9578afc67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fcbc8fb-0e1c-4d50-987d-36b9578afc67
Content-Type: application/json

--- request body ---
{"handle":"qa-76d31ecdf41b","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6fcbc8fb-0e1c-4d50-987d-36b9578afc67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6fcbc8fb-0e1c-4d50-987d-36b9578afc67"}
```
