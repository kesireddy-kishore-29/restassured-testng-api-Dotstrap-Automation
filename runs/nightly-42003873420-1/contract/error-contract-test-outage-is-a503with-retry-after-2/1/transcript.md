# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-e3157052-4be7-42bc-be48-54816264de8b` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-739aa571-fbb7-44ae-bfad-77106ea1cc81` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-df7deea4-90bb-47a7-9ec4-9a78d1ce99b7` |
| 4 | `POST /v1/conversations` | 201 | 28 | `qa-4e852494-5d44-4e3e-810e-97888ade597e` |
| 5 | `GET /v1/accounts/me` | 503 | 19 | `qa-6856e968-f979-4852-8028-d7211dbc207a` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-d04e28da-8f87-4058-a77b-a7c53ad08696` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-19dac0da-c0ac-4c5f-96a4-311ca0e73526` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-1de271aa-6780-4e1a-a457-4c818b33a26a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-f1feed05-4cb2-46ab-8d74-2600ef221bdf` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-5b4efe5c-2046-4175-bfa1-45d44813cc0a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e3157052-4be7-42bc-be48-54816264de8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3157052-4be7-42bc-be48-54816264de8b
Content-Type: application/json

--- request body ---
{"handle":"qa-055b760f85a9","displayName":"QA 055b760f85a9","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3157052-4be7-42bc-be48-54816264de8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Location: /v1/accounts/qa-055b760f85a9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7bec98d1-f0cb-452e-a2fb-10dbe1047753","handle":"qa-055b760f85a9","displayName":"QA 055b760f85a9","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.843380668Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-739aa571-fbb7-44ae-bfad-77106ea1cc81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-739aa571-fbb7-44ae-bfad-77106ea1cc81
Content-Type: application/json

--- request body ---
{"handle":"qa-652534784c67","displayName":"QA 652534784c67","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-739aa571-fbb7-44ae-bfad-77106ea1cc81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Location: /v1/accounts/qa-652534784c67
X-Served-Region: eu
Content-Length: 181

{"id":"acc_10bf4529-0972-4327-b586-cd1d0da043a6","handle":"qa-652534784c67","displayName":"QA 652534784c67","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.905398523Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-df7deea4-90bb-47a7-9ec4-9a78d1ce99b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df7deea4-90bb-47a7-9ec4-9a78d1ce99b7
Content-Type: application/json

--- request body ---
{"handle":"qa-055b760f85a9","password":"****"}

--- response: 200 in 38 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-df7deea4-90bb-47a7-9ec4-9a78d1ce99b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7bec98d1-f0cb-452e-a2fb-10dbe1047753"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4e852494-5d44-4e3e-810e-97888ade597e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e852494-5d44-4e3e-810e-97888ade597e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-652534784c67","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e852494-5d44-4e3e-810e-97888ade597e
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
Location: /v1/conversations/cnv_6ebc5126-6241-441e-93a5-581feac1ed8d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6ebc5126-6241-441e-93a5-581feac1ed8d","subject":"Error contract","status":"open","region":"eu","participants":["qa-055b760f85a9","qa-652534784c67"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:53.992312451Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-6856e968-f979-4852-8028-d7211dbc207a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f8f13c49-b147-4492-a94b-9487eb70b6eb
X-Correlation-Id: qa-6856e968-f979-4852-8028-d7211dbc207a
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6856e968-f979-4852-8028-d7211dbc207a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-6856e968-f979-4852-8028-d7211dbc207a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d04e28da-8f87-4058-a77b-a7c53ad08696

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d04e28da-8f87-4058-a77b-a7c53ad08696
Content-Type: application/json

--- request body ---
{"handle":"qa-652534784c67","password":"****"}

--- response: 200 in 44 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d04e28da-8f87-4058-a77b-a7c53ad08696
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_10bf4529-0972-4327-b586-cd1d0da043a6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19dac0da-c0ac-4c5f-96a4-311ca0e73526

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19dac0da-c0ac-4c5f-96a4-311ca0e73526
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19dac0da-c0ac-4c5f-96a4-311ca0e73526
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
correlation: qa-1de271aa-6780-4e1a-a457-4c818b33a26a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1de271aa-6780-4e1a-a457-4c818b33a26a
Content-Type: application/json

--- request body ---
{"handle":"qa-652534784c67","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1de271aa-6780-4e1a-a457-4c818b33a26a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1de271aa-6780-4e1a-a457-4c818b33a26a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f1feed05-4cb2-46ab-8d74-2600ef221bdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1feed05-4cb2-46ab-8d74-2600ef221bdf
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f1feed05-4cb2-46ab-8d74-2600ef221bdf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5b4efe5c-2046-4175-bfa1-45d44813cc0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b4efe5c-2046-4175-bfa1-45d44813cc0a
Content-Type: application/json

--- request body ---
{"handle":"qa-055b760f85a9","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b4efe5c-2046-4175-bfa1-45d44813cc0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b4efe5c-2046-4175-bfa1-45d44813cc0a"}
```
