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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-0accb0d4-f6e4-46a9-a8d8-07f201d9dfa1` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-54f04aab-1a56-428a-9c7f-14ad5900bbc7` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-a7920892-d3c8-4d9e-ade3-56e7c9934ed5` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-67af9261-a85b-4318-a5d3-ca8348282111` |
| 5 | `PATCH /v1/accounts/me` | 415 | 19 | `qa-c1e22666-bc08-4628-a153-39bb94ecf64e` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-4ca5d405-22a3-4631-bc61-6670354daf92` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-e34aa524-d207-4359-9232-038a7261c605` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-221de3c7-ac5a-4adc-954e-3fb8e1abce16` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-e35c01b4-4e10-419c-b201-b8b134ee2cc8` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-4423588c-2968-49f7-9fe5-a8c3582d97b6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0accb0d4-f6e4-46a9-a8d8-07f201d9dfa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0accb0d4-f6e4-46a9-a8d8-07f201d9dfa1
Content-Type: application/json

--- request body ---
{"handle":"qa-e03410a502ea","displayName":"QA e03410a502ea","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0accb0d4-f6e4-46a9-a8d8-07f201d9dfa1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Location: /v1/accounts/qa-e03410a502ea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b5a2d94c-f092-4a56-92c6-be21a953ae91","handle":"qa-e03410a502ea","displayName":"QA e03410a502ea","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.480321144Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-54f04aab-1a56-428a-9c7f-14ad5900bbc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54f04aab-1a56-428a-9c7f-14ad5900bbc7
Content-Type: application/json

--- request body ---
{"handle":"qa-726d43a9f63d","displayName":"QA 726d43a9f63d","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-54f04aab-1a56-428a-9c7f-14ad5900bbc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 8
Location: /v1/accounts/qa-726d43a9f63d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3bf4230f-ebd4-43e8-8db6-8194b96721fe","handle":"qa-726d43a9f63d","displayName":"QA 726d43a9f63d","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.526276766Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a7920892-d3c8-4d9e-ade3-56e7c9934ed5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7920892-d3c8-4d9e-ade3-56e7c9934ed5
Content-Type: application/json

--- request body ---
{"handle":"qa-e03410a502ea","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7920892-d3c8-4d9e-ade3-56e7c9934ed5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b5a2d94c-f092-4a56-92c6-be21a953ae91"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-67af9261-a85b-4318-a5d3-ca8348282111

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67af9261-a85b-4318-a5d3-ca8348282111
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-726d43a9f63d","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-67af9261-a85b-4318-a5d3-ca8348282111
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
Location: /v1/conversations/cnv_da530e0c-072b-42f8-b416-e7e2ed9d980b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_da530e0c-072b-42f8-b416-e7e2ed9d980b","subject":"Error contract","status":"open","region":"eu","participants":["qa-e03410a502ea","qa-726d43a9f63d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:36.631568328Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-c1e22666-bc08-4628-a153-39bb94ecf64e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1e22666-bc08-4628-a153-39bb94ecf64e
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1e22666-bc08-4628-a153-39bb94ecf64e
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-c1e22666-bc08-4628-a153-39bb94ecf64e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4ca5d405-22a3-4631-bc61-6670354daf92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ca5d405-22a3-4631-bc61-6670354daf92
Content-Type: application/json

--- request body ---
{"handle":"qa-726d43a9f63d","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ca5d405-22a3-4631-bc61-6670354daf92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3bf4230f-ebd4-43e8-8db6-8194b96721fe"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e34aa524-d207-4359-9232-038a7261c605

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e34aa524-d207-4359-9232-038a7261c605
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e34aa524-d207-4359-9232-038a7261c605
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
correlation: qa-221de3c7-ac5a-4adc-954e-3fb8e1abce16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-221de3c7-ac5a-4adc-954e-3fb8e1abce16
Content-Type: application/json

--- request body ---
{"handle":"qa-726d43a9f63d","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-221de3c7-ac5a-4adc-954e-3fb8e1abce16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-221de3c7-ac5a-4adc-954e-3fb8e1abce16"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e35c01b4-4e10-419c-b201-b8b134ee2cc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e35c01b4-4e10-419c-b201-b8b134ee2cc8
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e35c01b4-4e10-419c-b201-b8b134ee2cc8
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
correlation: qa-4423588c-2968-49f7-9fe5-a8c3582d97b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4423588c-2968-49f7-9fe5-a8c3582d97b6
Content-Type: application/json

--- request body ---
{"handle":"qa-e03410a502ea","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4423588c-2968-49f7-9fe5-a8c3582d97b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4423588c-2968-49f7-9fe5-a8c3582d97b6"}
```
