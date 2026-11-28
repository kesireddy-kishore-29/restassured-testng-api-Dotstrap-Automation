# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-5d104869-934f-4a56-9340-0709dedaf5fc` |
| 2 | `POST /v1/accounts` | 201 | 77 | `qa-41dd4088-c4a9-47e1-b7b7-ce09696257b9` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-1f5af63d-9e9b-47cd-8c0b-46df36d1e14b` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-0294deab-c89f-4ac6-9c14-81d1fb12fca6` |
| 5 | `PATCH /v1/accounts/me` | 415 | 25 | `qa-eaf147a5-d12c-4899-8b2f-94c72c154032` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-b21eacdc-9497-41d9-9a48-f8a7d4cac844` |
| 7 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-ec4212b2-7fcf-4b25-9038-4175ee8e621c` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-e85c3b1f-be5a-4f3c-908e-9b6828c2e748` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-735b7fd0-87b9-4fe5-a38c-71ef02bd5344` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-9a1f3dd2-d58e-447b-9857-0c3828542159` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5d104869-934f-4a56-9340-0709dedaf5fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d104869-934f-4a56-9340-0709dedaf5fc
Content-Type: application/json

--- request body ---
{"handle":"qa-2d69807726db","displayName":"QA 2d69807726db","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d104869-934f-4a56-9340-0709dedaf5fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Location: /v1/accounts/qa-2d69807726db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b4e70b6-d20b-4126-a868-472066aa42b6","handle":"qa-2d69807726db","displayName":"QA 2d69807726db","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.909174875Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-41dd4088-c4a9-47e1-b7b7-ce09696257b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41dd4088-c4a9-47e1-b7b7-ce09696257b9
Content-Type: application/json

--- request body ---
{"handle":"qa-17dc262cc674","displayName":"QA 17dc262cc674","password":"****","region":"eu"}

--- response: 201 in 77 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-41dd4088-c4a9-47e1-b7b7-ce09696257b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 7
Location: /v1/accounts/qa-17dc262cc674
X-Served-Region: eu
Content-Length: 181

{"id":"acc_29dc8709-d2de-426e-b35e-83618dba00f9","handle":"qa-17dc262cc674","displayName":"QA 17dc262cc674","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.010947572Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1f5af63d-9e9b-47cd-8c0b-46df36d1e14b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f5af63d-9e9b-47cd-8c0b-46df36d1e14b
Content-Type: application/json

--- request body ---
{"handle":"qa-2d69807726db","password":"****"}

--- response: 200 in 53 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f5af63d-9e9b-47cd-8c0b-46df36d1e14b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4e70b6-d20b-4126-a868-472066aa42b6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0294deab-c89f-4ac6-9c14-81d1fb12fca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0294deab-c89f-4ac6-9c14-81d1fb12fca6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-17dc262cc674","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-0294deab-c89f-4ac6-9c14-81d1fb12fca6
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
Location: /v1/conversations/cnv_37fc6af8-2413-43b6-b572-9d53a1a29c64
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_37fc6af8-2413-43b6-b572-9d53a1a29c64","subject":"Error contract","status":"open","region":"eu","participants":["qa-2d69807726db","qa-17dc262cc674"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.153286322Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-eaf147a5-d12c-4899-8b2f-94c72c154032

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaf147a5-d12c-4899-8b2f-94c72c154032
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eaf147a5-d12c-4899-8b2f-94c72c154032
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-eaf147a5-d12c-4899-8b2f-94c72c154032"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b21eacdc-9497-41d9-9a48-f8a7d4cac844

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b21eacdc-9497-41d9-9a48-f8a7d4cac844
Content-Type: application/json

--- request body ---
{"handle":"qa-17dc262cc674","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-b21eacdc-9497-41d9-9a48-f8a7d4cac844
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_29dc8709-d2de-426e-b35e-83618dba00f9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ec4212b2-7fcf-4b25-9038-4175ee8e621c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec4212b2-7fcf-4b25-9038-4175ee8e621c
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ec4212b2-7fcf-4b25-9038-4175ee8e621c
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
correlation: qa-e85c3b1f-be5a-4f3c-908e-9b6828c2e748

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e85c3b1f-be5a-4f3c-908e-9b6828c2e748
Content-Type: application/json

--- request body ---
{"handle":"qa-17dc262cc674","password":"****"}

--- response: 401 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e85c3b1f-be5a-4f3c-908e-9b6828c2e748
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e85c3b1f-be5a-4f3c-908e-9b6828c2e748"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-735b7fd0-87b9-4fe5-a38c-71ef02bd5344

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-735b7fd0-87b9-4fe5-a38c-71ef02bd5344
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-735b7fd0-87b9-4fe5-a38c-71ef02bd5344
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
correlation: qa-9a1f3dd2-d58e-447b-9857-0c3828542159

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a1f3dd2-d58e-447b-9857-0c3828542159
Content-Type: application/json

--- request body ---
{"handle":"qa-2d69807726db","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a1f3dd2-d58e-447b-9857-0c3828542159
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9a1f3dd2-d58e-447b-9857-0c3828542159"}
```
