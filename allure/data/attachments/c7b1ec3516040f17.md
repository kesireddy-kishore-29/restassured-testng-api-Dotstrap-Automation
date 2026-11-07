# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-a4f2c035-eeb1-4a55-9835-a3ada31c0b1b` |
| 2 | `POST /v1/accounts` | 201 | 60 | `qa-33a141c6-55c4-47aa-b415-65b5f451c91b` |
| 3 | `POST /v1/accounts` | 201 | 24 | `qa-2d854969-aca3-45ed-b906-b37f7ec1f412` |
| 4 | `POST /v1/auth/token` | 200 | 25 | `qa-5b7b2522-7ce5-4475-a6b3-66c723d0b42e` |
| 5 | `POST /v1/conversations` | 201 | 21 | `qa-2b78d2af-4dc1-4bea-81ee-54cc8307300c` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-4e161dd4-ca1e-4d52-8350-453a00c27957` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 12 | `qa-175ebf76-2468-4038-ad7f-9c4cb1a470fd` |
| 8 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-cdb3556d-2e60-4602-81ad-545ea6683333` |
| 9 | `POST /v1/auth/token` | 401 | 26 | `qa-cde858df-b671-4c38-99f2-bd5eb7543622` |
| 10 | `POST /v1/auth/token` | 200 | 22 | `qa-29fc1ad9-9cdf-4169-ad04-cdc6c5f5082f` |
| 11 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-cb38182b-d7ce-48eb-9a62-befd19eac986` |
| 12 | `POST /v1/auth/token` | 401 | 23 | `qa-010c1e9c-ecf4-4c09-95ba-9ccf13373aa0` |
| 13 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-7cb5a93d-2239-4101-90cb-04d952224585` |
| 14 | `POST /v1/auth/token` | 401 | 6 | `qa-719dad56-a528-425a-b8fe-2a8b7f2f2058` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a4f2c035-eeb1-4a55-9835-a3ada31c0b1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4f2c035-eeb1-4a55-9835-a3ada31c0b1b
Content-Type: application/json

--- request body ---
{"handle":"qa-ae1adc573a9c","displayName":"QA ae1adc573a9c","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4f2c035-eeb1-4a55-9835-a3ada31c0b1b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Location: /v1/accounts/qa-ae1adc573a9c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a685c168-e860-4ac0-a032-c9ab6d93e3ab","handle":"qa-ae1adc573a9c","displayName":"QA ae1adc573a9c","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.395379793Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-33a141c6-55c4-47aa-b415-65b5f451c91b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33a141c6-55c4-47aa-b415-65b5f451c91b
Content-Type: application/json

--- request body ---
{"handle":"qa-0a9926b88ba2","displayName":"QA 0a9926b88ba2","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-33a141c6-55c4-47aa-b415-65b5f451c91b
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
Location: /v1/accounts/qa-0a9926b88ba2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f07c4d9-63c2-42cd-854f-1350e5d57760","handle":"qa-0a9926b88ba2","displayName":"QA 0a9926b88ba2","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.453674353Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-2d854969-aca3-45ed-b906-b37f7ec1f412

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d854969-aca3-45ed-b906-b37f7ec1f412
Content-Type: application/json

--- request body ---
{"handle":"qa-958c18bc1589","displayName":"QA 958c18bc1589","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d854969-aca3-45ed-b906-b37f7ec1f412
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Location: /v1/accounts/qa-958c18bc1589
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f171c6fd-71ec-4f18-95a2-440989de8e99","handle":"qa-958c18bc1589","displayName":"QA 958c18bc1589","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.531549384Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-5b7b2522-7ce5-4475-a6b3-66c723d0b42e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b7b2522-7ce5-4475-a6b3-66c723d0b42e
Content-Type: application/json

--- request body ---
{"handle":"qa-ae1adc573a9c","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b7b2522-7ce5-4475-a6b3-66c723d0b42e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a685c168-e860-4ac0-a032-c9ab6d93e3ab"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-2b78d2af-4dc1-4bea-81ee-54cc8307300c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b78d2af-4dc1-4bea-81ee-54cc8307300c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0a9926b88ba2","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b78d2af-4dc1-4bea-81ee-54cc8307300c
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
Location: /v1/conversations/cnv_fe90b927-1334-4e75-9e96-243cc9324d8d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fe90b927-1334-4e75-9e96-243cc9324d8d","subject":"Error contract","status":"open","region":"eu","participants":["qa-ae1adc573a9c","qa-0a9926b88ba2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:58.590537580Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4e161dd4-ca1e-4d52-8350-453a00c27957

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e161dd4-ca1e-4d52-8350-453a00c27957
Content-Type: application/json

--- request body ---
{"handle":"qa-958c18bc1589","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e161dd4-ca1e-4d52-8350-453a00c27957
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f171c6fd-71ec-4f18-95a2-440989de8e99"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_fe90b927-1334-4e75-9e96-243cc9324d8d/close
correlation: qa-175ebf76-2468-4038-ad7f-9c4cb1a470fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-175ebf76-2468-4038-ad7f-9c4cb1a470fd
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-175ebf76-2468-4038-ad7f-9c4cb1a470fd
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_fe90b927-1334-4e75-9e96-243cc9324d8d/close","correlationId":"qa-175ebf76-2468-4038-ad7f-9c4cb1a470fd"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cdb3556d-2e60-4602-81ad-545ea6683333

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdb3556d-2e60-4602-81ad-545ea6683333
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cdb3556d-2e60-4602-81ad-545ea6683333
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-cde858df-b671-4c38-99f2-bd5eb7543622

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cde858df-b671-4c38-99f2-bd5eb7543622
Content-Type: application/json

--- request body ---
{"handle":"qa-958c18bc1589","password":"****"}

--- response: 401 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cde858df-b671-4c38-99f2-bd5eb7543622
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cde858df-b671-4c38-99f2-bd5eb7543622"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-29fc1ad9-9cdf-4169-ad04-cdc6c5f5082f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29fc1ad9-9cdf-4169-ad04-cdc6c5f5082f
Content-Type: application/json

--- request body ---
{"handle":"qa-0a9926b88ba2","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-29fc1ad9-9cdf-4169-ad04-cdc6c5f5082f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f07c4d9-63c2-42cd-854f-1350e5d57760"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cb38182b-d7ce-48eb-9a62-befd19eac986

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb38182b-d7ce-48eb-9a62-befd19eac986
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cb38182b-d7ce-48eb-9a62-befd19eac986
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-010c1e9c-ecf4-4c09-95ba-9ccf13373aa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-010c1e9c-ecf4-4c09-95ba-9ccf13373aa0
Content-Type: application/json

--- request body ---
{"handle":"qa-0a9926b88ba2","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-010c1e9c-ecf4-4c09-95ba-9ccf13373aa0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-010c1e9c-ecf4-4c09-95ba-9ccf13373aa0"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7cb5a93d-2239-4101-90cb-04d952224585

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cb5a93d-2239-4101-90cb-04d952224585
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7cb5a93d-2239-4101-90cb-04d952224585
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-719dad56-a528-425a-b8fe-2a8b7f2f2058

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-719dad56-a528-425a-b8fe-2a8b7f2f2058
Content-Type: application/json

--- request body ---
{"handle":"qa-ae1adc573a9c","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-719dad56-a528-425a-b8fe-2a8b7f2f2058
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-719dad56-a528-425a-b8fe-2a8b7f2f2058"}
```
