# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-20e0429f-eab3-4922-b844-1d928106de1b` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-2a74c11e-2ac9-4a7c-b63b-ef92f31779d9` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-44530b6e-d67a-4186-8501-ab7daf2efc13` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-33941cc5-4c70-4608-a779-0c3714c1bc83` |
| 5 | `GET /v1/admin/stats` | 503 | 15 | `qa-ee3c0b46-59ff-47d5-b2eb-096b150aa382` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-7ae48c7a-9568-48e2-882c-a2aab550a2bf` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-21461902-bf81-40b1-ab12-706c47dc3d9f` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-544dd67f-d1ba-41d5-ac93-bccf10be719d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-ea2931ad-f226-4ee9-a03d-154f9c960795` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-1103b597-120e-4288-93b0-c37b2844a6c4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-20e0429f-eab3-4922-b844-1d928106de1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20e0429f-eab3-4922-b844-1d928106de1b
Content-Type: application/json

--- request body ---
{"handle":"qa-0472b19bc372","displayName":"QA 0472b19bc372","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-20e0429f-eab3-4922-b844-1d928106de1b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 7
Location: /v1/accounts/qa-0472b19bc372
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc113beb-6c69-4288-895f-88536e3d60bc","handle":"qa-0472b19bc372","displayName":"QA 0472b19bc372","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.861338720Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2a74c11e-2ac9-4a7c-b63b-ef92f31779d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a74c11e-2ac9-4a7c-b63b-ef92f31779d9
Content-Type: application/json

--- request body ---
{"handle":"qa-70c26678d1e8","displayName":"QA 70c26678d1e8","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a74c11e-2ac9-4a7c-b63b-ef92f31779d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 7
Location: /v1/accounts/qa-70c26678d1e8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3c3fb03e-fd5c-43ab-a53f-f10fded50947","handle":"qa-70c26678d1e8","displayName":"QA 70c26678d1e8","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.886471420Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-44530b6e-d67a-4186-8501-ab7daf2efc13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44530b6e-d67a-4186-8501-ab7daf2efc13
Content-Type: application/json

--- request body ---
{"handle":"qa-0472b19bc372","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-44530b6e-d67a-4186-8501-ab7daf2efc13
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fc113beb-6c69-4288-895f-88536e3d60bc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-33941cc5-4c70-4608-a779-0c3714c1bc83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33941cc5-4c70-4608-a779-0c3714c1bc83
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-70c26678d1e8","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-33941cc5-4c70-4608-a779-0c3714c1bc83
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
Location: /v1/conversations/cnv_e04e3cf4-a67a-469c-be78-85dbbdf75442
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e04e3cf4-a67a-469c-be78-85dbbdf75442","subject":"Error contract","status":"open","region":"eu","participants":["qa-0472b19bc372","qa-70c26678d1e8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.957659440Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-ee3c0b46-59ff-47d5-b2eb-096b150aa382

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: fea28c4b-7d16-4e03-9289-581d9b8b9497
X-Correlation-Id: qa-ee3c0b46-59ff-47d5-b2eb-096b150aa382
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee3c0b46-59ff-47d5-b2eb-096b150aa382
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-ee3c0b46-59ff-47d5-b2eb-096b150aa382"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7ae48c7a-9568-48e2-882c-a2aab550a2bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ae48c7a-9568-48e2-882c-a2aab550a2bf
Content-Type: application/json

--- request body ---
{"handle":"qa-70c26678d1e8","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ae48c7a-9568-48e2-882c-a2aab550a2bf
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3c3fb03e-fd5c-43ab-a53f-f10fded50947"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21461902-bf81-40b1-ab12-706c47dc3d9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21461902-bf81-40b1-ab12-706c47dc3d9f
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-21461902-bf81-40b1-ab12-706c47dc3d9f
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
correlation: qa-544dd67f-d1ba-41d5-ac93-bccf10be719d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-544dd67f-d1ba-41d5-ac93-bccf10be719d
Content-Type: application/json

--- request body ---
{"handle":"qa-70c26678d1e8","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-544dd67f-d1ba-41d5-ac93-bccf10be719d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-544dd67f-d1ba-41d5-ac93-bccf10be719d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea2931ad-f226-4ee9-a03d-154f9c960795

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea2931ad-f226-4ee9-a03d-154f9c960795
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea2931ad-f226-4ee9-a03d-154f9c960795
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
correlation: qa-1103b597-120e-4288-93b0-c37b2844a6c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1103b597-120e-4288-93b0-c37b2844a6c4
Content-Type: application/json

--- request body ---
{"handle":"qa-0472b19bc372","password":"****"}

--- response: 401 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1103b597-120e-4288-93b0-c37b2844a6c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1103b597-120e-4288-93b0-c37b2844a6c4"}
```
