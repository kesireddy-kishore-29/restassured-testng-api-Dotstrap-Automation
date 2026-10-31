# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-4c442c72-d3ba-4b00-8749-8670753b9ace` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-9223610b-ef0b-4674-a423-c6d6d2616f23` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-fd516961-be8b-45e7-8114-a9d95eb55ee1` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-4738fc78-e4dd-4695-a9bc-b353c035ab7c` |
| 5 | `POST /v1/conversations` | 415 | 21 | `qa-c616d8b9-b563-4764-beae-714f79bc0588` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-89640042-075a-41cf-99f1-c7805f867eab` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-2ef12c5b-c6de-4c58-a778-d4237ca187f4` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-e3b19b91-968d-4af9-a784-df020c0ec4ab` |
| 9 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-5f8e413c-c78d-4760-942e-5734c1833d17` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-0bb9ff31-3b7c-4101-852d-0d59cde005c4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4c442c72-d3ba-4b00-8749-8670753b9ace

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c442c72-d3ba-4b00-8749-8670753b9ace
Content-Type: application/json

--- request body ---
{"handle":"qa-e63cd7b51328","displayName":"QA e63cd7b51328","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c442c72-d3ba-4b00-8749-8670753b9ace
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Location: /v1/accounts/qa-e63cd7b51328
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e5f1dae4-404f-4dac-9082-4b0dfb13d0d1","handle":"qa-e63cd7b51328","displayName":"QA e63cd7b51328","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.754267462Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9223610b-ef0b-4674-a423-c6d6d2616f23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9223610b-ef0b-4674-a423-c6d6d2616f23
Content-Type: application/json

--- request body ---
{"handle":"qa-1ce5c404267f","displayName":"QA 1ce5c404267f","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-9223610b-ef0b-4674-a423-c6d6d2616f23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Location: /v1/accounts/qa-1ce5c404267f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f8bc5d5-aa70-4180-978c-7c8ee6e48c50","handle":"qa-1ce5c404267f","displayName":"QA 1ce5c404267f","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.777789790Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fd516961-be8b-45e7-8114-a9d95eb55ee1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd516961-be8b-45e7-8114-a9d95eb55ee1
Content-Type: application/json

--- request body ---
{"handle":"qa-e63cd7b51328","password":"****"}

--- response: 200 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd516961-be8b-45e7-8114-a9d95eb55ee1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e5f1dae4-404f-4dac-9082-4b0dfb13d0d1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4738fc78-e4dd-4695-a9bc-b353c035ab7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4738fc78-e4dd-4695-a9bc-b353c035ab7c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1ce5c404267f","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4738fc78-e4dd-4695-a9bc-b353c035ab7c
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
Location: /v1/conversations/cnv_3c235015-5000-49ae-81ca-3ccd057bfd2b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3c235015-5000-49ae-81ca-3ccd057bfd2b","subject":"Error contract","status":"open","region":"eu","participants":["qa-e63cd7b51328","qa-1ce5c404267f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.856863733Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-c616d8b9-b563-4764-beae-714f79bc0588

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c616d8b9-b563-4764-beae-714f79bc0588
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 21 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c616d8b9-b563-4764-beae-714f79bc0588
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-c616d8b9-b563-4764-beae-714f79bc0588"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-89640042-075a-41cf-99f1-c7805f867eab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89640042-075a-41cf-99f1-c7805f867eab
Content-Type: application/json

--- request body ---
{"handle":"qa-1ce5c404267f","password":"****"}

--- response: 200 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-89640042-075a-41cf-99f1-c7805f867eab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7f8bc5d5-aa70-4180-978c-7c8ee6e48c50"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2ef12c5b-c6de-4c58-a778-d4237ca187f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ef12c5b-c6de-4c58-a778-d4237ca187f4
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2ef12c5b-c6de-4c58-a778-d4237ca187f4
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
correlation: qa-e3b19b91-968d-4af9-a784-df020c0ec4ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3b19b91-968d-4af9-a784-df020c0ec4ab
Content-Type: application/json

--- request body ---
{"handle":"qa-1ce5c404267f","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3b19b91-968d-4af9-a784-df020c0ec4ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e3b19b91-968d-4af9-a784-df020c0ec4ab"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f8e413c-c78d-4760-942e-5734c1833d17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f8e413c-c78d-4760-942e-5734c1833d17
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f8e413c-c78d-4760-942e-5734c1833d17
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
correlation: qa-0bb9ff31-3b7c-4101-852d-0d59cde005c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bb9ff31-3b7c-4101-852d-0d59cde005c4
Content-Type: application/json

--- request body ---
{"handle":"qa-e63cd7b51328","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0bb9ff31-3b7c-4101-852d-0d59cde005c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0bb9ff31-3b7c-4101-852d-0d59cde005c4"}
```
