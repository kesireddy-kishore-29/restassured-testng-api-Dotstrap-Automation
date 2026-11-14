# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-b82abeb2-2641-45b2-b166-bf40f6dedbbe` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-8e9b2fb3-c90f-4368-969a-a7f12d8a50a4` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-5fb5f119-bc5e-4436-8e2a-7d482a0b5792` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-6d26b8cf-c002-4221-855e-82d6453f7ba9` |
| 5 | `POST /v1/accounts` | 400 | 8 | `qa-b417fe2b-a7aa-4cda-a5ec-29f6f7450fb4` |
| 6 | `POST /v1/auth/token` | 200 | 8 | `qa-b3bdeaed-a245-496b-ad7d-598f74c399e8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-aa4b7dcd-9034-4b5b-b536-eb7cfe3499f4` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-d53c5514-efb6-4a90-824e-8084c7e1f017` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-07b5843b-3bf8-4ff6-bc23-c8030e74ae4f` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-8b92f7ff-d97a-4c1f-9e12-8b2da01d6aa2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b82abeb2-2641-45b2-b166-bf40f6dedbbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b82abeb2-2641-45b2-b166-bf40f6dedbbe
Content-Type: application/json

--- request body ---
{"handle":"qa-3cab5f7a7bb1","displayName":"QA 3cab5f7a7bb1","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b82abeb2-2641-45b2-b166-bf40f6dedbbe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Location: /v1/accounts/qa-3cab5f7a7bb1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c300423d-0d6b-4325-b28d-bf492fbecd68","handle":"qa-3cab5f7a7bb1","displayName":"QA 3cab5f7a7bb1","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.876161103Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8e9b2fb3-c90f-4368-969a-a7f12d8a50a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e9b2fb3-c90f-4368-969a-a7f12d8a50a4
Content-Type: application/json

--- request body ---
{"handle":"qa-e9e4ed04465a","displayName":"QA e9e4ed04465a","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e9b2fb3-c90f-4368-969a-a7f12d8a50a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Location: /v1/accounts/qa-e9e4ed04465a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e36074d-3d90-4a0f-934f-bd047469a7c8","handle":"qa-e9e4ed04465a","displayName":"QA e9e4ed04465a","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.929986797Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5fb5f119-bc5e-4436-8e2a-7d482a0b5792

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fb5f119-bc5e-4436-8e2a-7d482a0b5792
Content-Type: application/json

--- request body ---
{"handle":"qa-3cab5f7a7bb1","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fb5f119-bc5e-4436-8e2a-7d482a0b5792
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c300423d-0d6b-4325-b28d-bf492fbecd68"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6d26b8cf-c002-4221-855e-82d6453f7ba9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d26b8cf-c002-4221-855e-82d6453f7ba9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e9e4ed04465a","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d26b8cf-c002-4221-855e-82d6453f7ba9
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
Location: /v1/conversations/cnv_2a49469d-293f-4428-9bb5-f659b5bd2309
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2a49469d-293f-4428-9bb5-f659b5bd2309","subject":"Error contract","status":"open","region":"eu","participants":["qa-3cab5f7a7bb1","qa-e9e4ed04465a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:02.002797830Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-b417fe2b-a7aa-4cda-a5ec-29f6f7450fb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b417fe2b-a7aa-4cda-a5ec-29f6f7450fb4
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b417fe2b-a7aa-4cda-a5ec-29f6f7450fb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 10
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-b417fe2b-a7aa-4cda-a5ec-29f6f7450fb4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b3bdeaed-a245-496b-ad7d-598f74c399e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3bdeaed-a245-496b-ad7d-598f74c399e8
Content-Type: application/json

--- request body ---
{"handle":"qa-e9e4ed04465a","password":"****"}

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3bdeaed-a245-496b-ad7d-598f74c399e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e36074d-3d90-4a0f-934f-bd047469a7c8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa4b7dcd-9034-4b5b-b536-eb7cfe3499f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa4b7dcd-9034-4b5b-b536-eb7cfe3499f4
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa4b7dcd-9034-4b5b-b536-eb7cfe3499f4
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
correlation: qa-d53c5514-efb6-4a90-824e-8084c7e1f017

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d53c5514-efb6-4a90-824e-8084c7e1f017
Content-Type: application/json

--- request body ---
{"handle":"qa-e9e4ed04465a","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d53c5514-efb6-4a90-824e-8084c7e1f017
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d53c5514-efb6-4a90-824e-8084c7e1f017"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-07b5843b-3bf8-4ff6-bc23-c8030e74ae4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07b5843b-3bf8-4ff6-bc23-c8030e74ae4f
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-07b5843b-3bf8-4ff6-bc23-c8030e74ae4f
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
correlation: qa-8b92f7ff-d97a-4c1f-9e12-8b2da01d6aa2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b92f7ff-d97a-4c1f-9e12-8b2da01d6aa2
Content-Type: application/json

--- request body ---
{"handle":"qa-3cab5f7a7bb1","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b92f7ff-d97a-4c1f-9e12-8b2da01d6aa2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8b92f7ff-d97a-4c1f-9e12-8b2da01d6aa2"}
```
