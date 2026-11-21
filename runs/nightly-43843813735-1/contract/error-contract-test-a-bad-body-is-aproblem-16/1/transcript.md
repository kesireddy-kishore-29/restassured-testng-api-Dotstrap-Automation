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
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-43977845-f6ab-4a97-abe4-cca585b26f68` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-5630a5f2-81cd-40f6-b02a-2cb9b8a7ae61` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-22848f5c-76a9-4323-aa9e-738e918f0fbf` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-a1355d7e-97a8-49f9-b71d-e7d9e6a0dbfe` |
| 5 | `POST /v1/credits/purchases` | 415 | 8 | `qa-a406c3ed-f199-45a0-a08d-a21be8f2bd9b` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-ebfe4c0e-1035-499f-8246-fe3d6eff19d4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-26f7b282-168a-4902-9ff7-9ed4b5dcbc14` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-4a4f3f9e-183c-48f0-841b-f7c8a854b26b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-2e3fd205-ce53-4aec-b864-8d4bc90659dc` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-2f81d3d6-ab7f-485d-a129-bf303d31f2ff` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-43977845-f6ab-4a97-abe4-cca585b26f68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43977845-f6ab-4a97-abe4-cca585b26f68
Content-Type: application/json

--- request body ---
{"handle":"qa-30424c19d24d","displayName":"QA 30424c19d24d","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-43977845-f6ab-4a97-abe4-cca585b26f68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 7
Location: /v1/accounts/qa-30424c19d24d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_56632a1f-d6cb-48fb-82d0-a79299f86d1a","handle":"qa-30424c19d24d","displayName":"QA 30424c19d24d","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.413987634Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5630a5f2-81cd-40f6-b02a-2cb9b8a7ae61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5630a5f2-81cd-40f6-b02a-2cb9b8a7ae61
Content-Type: application/json

--- request body ---
{"handle":"qa-680c006fc182","displayName":"QA 680c006fc182","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-5630a5f2-81cd-40f6-b02a-2cb9b8a7ae61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 7
Location: /v1/accounts/qa-680c006fc182
X-Served-Region: eu
Content-Length: 181

{"id":"acc_96ccbbf1-2384-40f4-8e71-f701cc2ef291","handle":"qa-680c006fc182","displayName":"QA 680c006fc182","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.441933344Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-22848f5c-76a9-4323-aa9e-738e918f0fbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22848f5c-76a9-4323-aa9e-738e918f0fbf
Content-Type: application/json

--- request body ---
{"handle":"qa-30424c19d24d","password":"****"}

--- response: 200 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-22848f5c-76a9-4323-aa9e-738e918f0fbf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_56632a1f-d6cb-48fb-82d0-a79299f86d1a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a1355d7e-97a8-49f9-b71d-e7d9e6a0dbfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1355d7e-97a8-49f9-b71d-e7d9e6a0dbfe
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-680c006fc182","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1355d7e-97a8-49f9-b71d-e7d9e6a0dbfe
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
Location: /v1/conversations/cnv_50cd636b-c856-4896-bef1-83f9be61b4f4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_50cd636b-c856-4896-bef1-83f9be61b4f4","subject":"Error contract","status":"open","region":"eu","participants":["qa-30424c19d24d","qa-680c006fc182"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.512667341Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a406c3ed-f199-45a0-a08d-a21be8f2bd9b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ebf6196e20214aae9cae9dde86fb419c
X-Correlation-Id: qa-a406c3ed-f199-45a0-a08d-a21be8f2bd9b
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a406c3ed-f199-45a0-a08d-a21be8f2bd9b
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-a406c3ed-f199-45a0-a08d-a21be8f2bd9b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ebfe4c0e-1035-499f-8246-fe3d6eff19d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebfe4c0e-1035-499f-8246-fe3d6eff19d4
Content-Type: application/json

--- request body ---
{"handle":"qa-680c006fc182","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebfe4c0e-1035-499f-8246-fe3d6eff19d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96ccbbf1-2384-40f4-8e71-f701cc2ef291"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26f7b282-168a-4902-9ff7-9ed4b5dcbc14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26f7b282-168a-4902-9ff7-9ed4b5dcbc14
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-26f7b282-168a-4902-9ff7-9ed4b5dcbc14
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
correlation: qa-4a4f3f9e-183c-48f0-841b-f7c8a854b26b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a4f3f9e-183c-48f0-841b-f7c8a854b26b
Content-Type: application/json

--- request body ---
{"handle":"qa-680c006fc182","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a4f3f9e-183c-48f0-841b-f7c8a854b26b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a4f3f9e-183c-48f0-841b-f7c8a854b26b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e3fd205-ce53-4aec-b864-8d4bc90659dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e3fd205-ce53-4aec-b864-8d4bc90659dc
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e3fd205-ce53-4aec-b864-8d4bc90659dc
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
correlation: qa-2f81d3d6-ab7f-485d-a129-bf303d31f2ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f81d3d6-ab7f-485d-a129-bf303d31f2ff
Content-Type: application/json

--- request body ---
{"handle":"qa-30424c19d24d","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f81d3d6-ab7f-485d-a129-bf303d31f2ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2f81d3d6-ab7f-485d-a129-bf303d31f2ff"}
```
