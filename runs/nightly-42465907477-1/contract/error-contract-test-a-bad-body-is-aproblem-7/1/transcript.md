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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-ecaaa2c9-60f1-4839-991a-d170a9fd723d` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-5d2f4a33-d4a6-4dab-90c1-3f6f57f11f5c` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-c4738f2c-7f86-4fe5-8743-43d75578df11` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-605dfda3-dbc9-424f-ab5c-5a5dd8b58a88` |
| 5 | `PATCH /v1/accounts/me` | 415 | 18 | `qa-95e36abb-9b0e-4cf1-a012-8f16b5039020` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-c8fbfb9c-8663-4d47-b860-2dd990d059c4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-d3472a01-52a4-4a8e-86c3-b79a68d7e30f` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-437ad3f0-7c10-4291-b432-efb4a07ca6e0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-6ffb85e2-8cc4-4706-9028-fd331d3e555d` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-ba84b4aa-2ebe-4eda-9051-366ac3e0c964` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ecaaa2c9-60f1-4839-991a-d170a9fd723d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecaaa2c9-60f1-4839-991a-d170a9fd723d
Content-Type: application/json

--- request body ---
{"handle":"qa-9d14feb3f82c","displayName":"QA 9d14feb3f82c","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecaaa2c9-60f1-4839-991a-d170a9fd723d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 9
Location: /v1/accounts/qa-9d14feb3f82c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_81cbf05e-8e73-4717-8db9-0f0b0cc1f1fd","handle":"qa-9d14feb3f82c","displayName":"QA 9d14feb3f82c","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.714300864Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5d2f4a33-d4a6-4dab-90c1-3f6f57f11f5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d2f4a33-d4a6-4dab-90c1-3f6f57f11f5c
Content-Type: application/json

--- request body ---
{"handle":"qa-98e2e1d946bf","displayName":"QA 98e2e1d946bf","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d2f4a33-d4a6-4dab-90c1-3f6f57f11f5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 9
Location: /v1/accounts/qa-98e2e1d946bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_965b859b-685b-4e26-83bb-3e40161ef89f","handle":"qa-98e2e1d946bf","displayName":"QA 98e2e1d946bf","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.748429715Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c4738f2c-7f86-4fe5-8743-43d75578df11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4738f2c-7f86-4fe5-8743-43d75578df11
Content-Type: application/json

--- request body ---
{"handle":"qa-9d14feb3f82c","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4738f2c-7f86-4fe5-8743-43d75578df11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_81cbf05e-8e73-4717-8db9-0f0b0cc1f1fd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-605dfda3-dbc9-424f-ab5c-5a5dd8b58a88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-605dfda3-dbc9-424f-ab5c-5a5dd8b58a88
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-98e2e1d946bf","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-605dfda3-dbc9-424f-ab5c-5a5dd8b58a88
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
Location: /v1/conversations/cnv_21ecf0d0-171f-4a65-a8cf-111437aa7c78
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_21ecf0d0-171f-4a65-a8cf-111437aa7c78","subject":"Error contract","status":"open","region":"eu","participants":["qa-9d14feb3f82c","qa-98e2e1d946bf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:02.816050974Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-95e36abb-9b0e-4cf1-a012-8f16b5039020

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95e36abb-9b0e-4cf1-a012-8f16b5039020
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95e36abb-9b0e-4cf1-a012-8f16b5039020
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-95e36abb-9b0e-4cf1-a012-8f16b5039020"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c8fbfb9c-8663-4d47-b860-2dd990d059c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8fbfb9c-8663-4d47-b860-2dd990d059c4
Content-Type: application/json

--- request body ---
{"handle":"qa-98e2e1d946bf","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8fbfb9c-8663-4d47-b860-2dd990d059c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_965b859b-685b-4e26-83bb-3e40161ef89f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d3472a01-52a4-4a8e-86c3-b79a68d7e30f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3472a01-52a4-4a8e-86c3-b79a68d7e30f
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d3472a01-52a4-4a8e-86c3-b79a68d7e30f
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
correlation: qa-437ad3f0-7c10-4291-b432-efb4a07ca6e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-437ad3f0-7c10-4291-b432-efb4a07ca6e0
Content-Type: application/json

--- request body ---
{"handle":"qa-98e2e1d946bf","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-437ad3f0-7c10-4291-b432-efb4a07ca6e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-437ad3f0-7c10-4291-b432-efb4a07ca6e0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6ffb85e2-8cc4-4706-9028-fd331d3e555d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ffb85e2-8cc4-4706-9028-fd331d3e555d
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6ffb85e2-8cc4-4706-9028-fd331d3e555d
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
correlation: qa-ba84b4aa-2ebe-4eda-9051-366ac3e0c964

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba84b4aa-2ebe-4eda-9051-366ac3e0c964
Content-Type: application/json

--- request body ---
{"handle":"qa-9d14feb3f82c","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba84b4aa-2ebe-4eda-9051-366ac3e0c964
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ba84b4aa-2ebe-4eda-9051-366ac3e0c964"}
```
