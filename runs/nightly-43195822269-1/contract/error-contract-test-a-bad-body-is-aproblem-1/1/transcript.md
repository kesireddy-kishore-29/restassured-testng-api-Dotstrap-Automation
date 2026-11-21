# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-a9cbfbbc-dc21-4e55-97d4-4bcb0a1805d3` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-9a6c4add-9dc6-403c-a0c7-3542d08d0d2c` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-f78c1553-e1da-4903-a86d-b49450ce7493` |
| 4 | `POST /v1/conversations` | 201 | 35 | `qa-9d475004-16fd-4406-9eb5-f501b968a525` |
| 5 | `POST /v1/auth/token` | 415 | 33 | `qa-c3db0d6c-8241-41ae-9089-642773accaa5` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-c8108437-cf7b-44d8-9bf3-24c5d96eb292` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-cd8f2c92-569f-40fc-a03d-caf33869e0ad` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-08cc2720-c1dd-41ad-a6e7-912453e5f390` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-ee285157-e8a4-4250-a1af-19aaa7f4f2a4` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-114aee2e-43e3-4e90-919e-7da7a76ae41b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a9cbfbbc-dc21-4e55-97d4-4bcb0a1805d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9cbfbbc-dc21-4e55-97d4-4bcb0a1805d3
Content-Type: application/json

--- request body ---
{"handle":"qa-7184564fd85a","displayName":"QA 7184564fd85a","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9cbfbbc-dc21-4e55-97d4-4bcb0a1805d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-7184564fd85a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d5ad1520-7676-4366-ab11-2f09e2574ef5","handle":"qa-7184564fd85a","displayName":"QA 7184564fd85a","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.083600365Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9a6c4add-9dc6-403c-a0c7-3542d08d0d2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a6c4add-9dc6-403c-a0c7-3542d08d0d2c
Content-Type: application/json

--- request body ---
{"handle":"qa-d826ed4e963d","displayName":"QA d826ed4e963d","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a6c4add-9dc6-403c-a0c7-3542d08d0d2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 10
Location: /v1/accounts/qa-d826ed4e963d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88111428-7d5f-4700-ba0b-a1d01dced652","handle":"qa-d826ed4e963d","displayName":"QA d826ed4e963d","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.116537674Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f78c1553-e1da-4903-a86d-b49450ce7493

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f78c1553-e1da-4903-a86d-b49450ce7493
Content-Type: application/json

--- request body ---
{"handle":"qa-7184564fd85a","password":"****"}

--- response: 200 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-f78c1553-e1da-4903-a86d-b49450ce7493
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d5ad1520-7676-4366-ab11-2f09e2574ef5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9d475004-16fd-4406-9eb5-f501b968a525

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d475004-16fd-4406-9eb5-f501b968a525
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d826ed4e963d","subject":"Error contract","message":"Hi"}

--- response: 201 in 35 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d475004-16fd-4406-9eb5-f501b968a525
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
Location: /v1/conversations/cnv_cecdd806-d415-4025-9cbc-2b5f836aecda
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cecdd806-d415-4025-9cbc-2b5f836aecda","subject":"Error contract","status":"open","region":"eu","participants":["qa-7184564fd85a","qa-d826ed4e963d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:30.185918841Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-c3db0d6c-8241-41ae-9089-642773accaa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3db0d6c-8241-41ae-9089-642773accaa5
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 33 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3db0d6c-8241-41ae-9089-642773accaa5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-c3db0d6c-8241-41ae-9089-642773accaa5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c8108437-cf7b-44d8-9bf3-24c5d96eb292

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8108437-cf7b-44d8-9bf3-24c5d96eb292
Content-Type: application/json

--- request body ---
{"handle":"qa-d826ed4e963d","password":"****"}

--- response: 200 in 39 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8108437-cf7b-44d8-9bf3-24c5d96eb292
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_88111428-7d5f-4700-ba0b-a1d01dced652"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd8f2c92-569f-40fc-a03d-caf33869e0ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd8f2c92-569f-40fc-a03d-caf33869e0ad
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd8f2c92-569f-40fc-a03d-caf33869e0ad
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
correlation: qa-08cc2720-c1dd-41ad-a6e7-912453e5f390

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08cc2720-c1dd-41ad-a6e7-912453e5f390
Content-Type: application/json

--- request body ---
{"handle":"qa-d826ed4e963d","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08cc2720-c1dd-41ad-a6e7-912453e5f390
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-08cc2720-c1dd-41ad-a6e7-912453e5f390"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee285157-e8a4-4250-a1af-19aaa7f4f2a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee285157-e8a4-4250-a1af-19aaa7f4f2a4
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee285157-e8a4-4250-a1af-19aaa7f4f2a4
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
correlation: qa-114aee2e-43e3-4e90-919e-7da7a76ae41b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-114aee2e-43e3-4e90-919e-7da7a76ae41b
Content-Type: application/json

--- request body ---
{"handle":"qa-7184564fd85a","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-114aee2e-43e3-4e90-919e-7da7a76ae41b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-114aee2e-43e3-4e90-919e-7da7a76ae41b"}
```
