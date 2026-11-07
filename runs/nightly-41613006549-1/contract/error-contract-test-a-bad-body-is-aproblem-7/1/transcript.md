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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-81e17ab6-6785-46ac-b1a8-dd46a498f8ac` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-1985d9d8-08ec-4b1d-ac31-2295b0dc910d` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-21a6a300-317e-4c99-9fa5-5af80dc33773` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-ea3dd35f-e89c-4ccc-aa37-417210533102` |
| 5 | `PATCH /v1/accounts/me` | 415 | 35 | `qa-bc40b45d-5b0d-4a51-aa27-eeb849c42126` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-11240db5-72a0-4c9e-ba41-b614b5010f90` |
| 7 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-8852a292-d7e2-4d07-966d-4bb1fdbfb15f` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-3a018660-91be-439e-8f71-d2ba24807a86` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-41389408-286a-4429-9725-5be772a3845e` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-d01a795c-2128-47b7-bc3b-88a423417b53` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-81e17ab6-6785-46ac-b1a8-dd46a498f8ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81e17ab6-6785-46ac-b1a8-dd46a498f8ac
Content-Type: application/json

--- request body ---
{"handle":"qa-1d8f1e4042ec","displayName":"QA 1d8f1e4042ec","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-81e17ab6-6785-46ac-b1a8-dd46a498f8ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 9
Location: /v1/accounts/qa-1d8f1e4042ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9cf47875-bf8f-4050-b4c1-c9582c02e70e","handle":"qa-1d8f1e4042ec","displayName":"QA 1d8f1e4042ec","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.364802806Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1985d9d8-08ec-4b1d-ac31-2295b0dc910d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1985d9d8-08ec-4b1d-ac31-2295b0dc910d
Content-Type: application/json

--- request body ---
{"handle":"qa-107be05d69d6","displayName":"QA 107be05d69d6","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-1985d9d8-08ec-4b1d-ac31-2295b0dc910d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 9
Location: /v1/accounts/qa-107be05d69d6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ffffbc50-3f4f-43c7-b9b9-afe47256978f","handle":"qa-107be05d69d6","displayName":"QA 107be05d69d6","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.394306532Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-21a6a300-317e-4c99-9fa5-5af80dc33773

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21a6a300-317e-4c99-9fa5-5af80dc33773
Content-Type: application/json

--- request body ---
{"handle":"qa-1d8f1e4042ec","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-21a6a300-317e-4c99-9fa5-5af80dc33773
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9cf47875-bf8f-4050-b4c1-c9582c02e70e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ea3dd35f-e89c-4ccc-aa37-417210533102

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea3dd35f-e89c-4ccc-aa37-417210533102
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-107be05d69d6","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea3dd35f-e89c-4ccc-aa37-417210533102
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
Location: /v1/conversations/cnv_43860adc-90c3-442a-8d6e-fd3f4853964a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_43860adc-90c3-442a-8d6e-fd3f4853964a","subject":"Error contract","status":"open","region":"eu","participants":["qa-1d8f1e4042ec","qa-107be05d69d6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.454647165Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-bc40b45d-5b0d-4a51-aa27-eeb849c42126

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc40b45d-5b0d-4a51-aa27-eeb849c42126
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 35 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc40b45d-5b0d-4a51-aa27-eeb849c42126
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-bc40b45d-5b0d-4a51-aa27-eeb849c42126"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-11240db5-72a0-4c9e-ba41-b614b5010f90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11240db5-72a0-4c9e-ba41-b614b5010f90
Content-Type: application/json

--- request body ---
{"handle":"qa-107be05d69d6","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-11240db5-72a0-4c9e-ba41-b614b5010f90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ffffbc50-3f4f-43c7-b9b9-afe47256978f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8852a292-d7e2-4d07-966d-4bb1fdbfb15f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8852a292-d7e2-4d07-966d-4bb1fdbfb15f
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8852a292-d7e2-4d07-966d-4bb1fdbfb15f
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
correlation: qa-3a018660-91be-439e-8f71-d2ba24807a86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a018660-91be-439e-8f71-d2ba24807a86
Content-Type: application/json

--- request body ---
{"handle":"qa-107be05d69d6","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a018660-91be-439e-8f71-d2ba24807a86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3a018660-91be-439e-8f71-d2ba24807a86"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-41389408-286a-4429-9725-5be772a3845e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41389408-286a-4429-9725-5be772a3845e
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-41389408-286a-4429-9725-5be772a3845e
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
correlation: qa-d01a795c-2128-47b7-bc3b-88a423417b53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d01a795c-2128-47b7-bc3b-88a423417b53
Content-Type: application/json

--- request body ---
{"handle":"qa-1d8f1e4042ec","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d01a795c-2128-47b7-bc3b-88a423417b53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d01a795c-2128-47b7-bc3b-88a423417b53"}
```
