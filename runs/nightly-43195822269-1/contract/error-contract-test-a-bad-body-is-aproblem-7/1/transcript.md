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
| 1 | `POST /v1/accounts` | 201 | 55 | `qa-a99efe43-4163-47c2-9a6d-302fa88e34b8` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-7a7e2dcb-d9a6-418e-877f-e632d18c3dc6` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-8f67a1dc-57e9-4a14-962f-ed8360f1037c` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-6974b05f-0050-4001-a6f9-6462f6e5941e` |
| 5 | `PATCH /v1/accounts/me` | 415 | 18 | `qa-fac55400-d6ea-4128-b1b2-8e3dc7dbc68d` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-5d71871c-8dd9-4741-950b-39f85adc4943` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-efb3c31e-45ba-4d28-bf46-34fee1507a3f` |
| 8 | `POST /v1/auth/token` | 401 | 32 | `qa-1974c827-6dd8-4977-a4b8-f382be09f305` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-0da78495-3f9f-459b-9a0e-53cc9e56a208` |
| 10 | `POST /v1/auth/token` | 401 | 2 | `qa-166e57bd-8634-48cc-ac7c-f2c4b0dfdbe1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a99efe43-4163-47c2-9a6d-302fa88e34b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a99efe43-4163-47c2-9a6d-302fa88e34b8
Content-Type: application/json

--- request body ---
{"handle":"qa-6ec825027c7c","displayName":"QA 6ec825027c7c","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-a99efe43-4163-47c2-9a6d-302fa88e34b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 9
Location: /v1/accounts/qa-6ec825027c7c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b54a38a7-cfb1-4e44-b992-14a2bd4abe72","handle":"qa-6ec825027c7c","displayName":"QA 6ec825027c7c","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.244440716Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7a7e2dcb-d9a6-418e-877f-e632d18c3dc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a7e2dcb-d9a6-418e-877f-e632d18c3dc6
Content-Type: application/json

--- request body ---
{"handle":"qa-12b1a58ad098","displayName":"QA 12b1a58ad098","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a7e2dcb-d9a6-418e-877f-e632d18c3dc6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 8
Location: /v1/accounts/qa-12b1a58ad098
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c46570cc-8339-4eb9-b655-0e478d343e23","handle":"qa-12b1a58ad098","displayName":"QA 12b1a58ad098","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.277517438Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8f67a1dc-57e9-4a14-962f-ed8360f1037c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f67a1dc-57e9-4a14-962f-ed8360f1037c
Content-Type: application/json

--- request body ---
{"handle":"qa-6ec825027c7c","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f67a1dc-57e9-4a14-962f-ed8360f1037c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b54a38a7-cfb1-4e44-b992-14a2bd4abe72"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6974b05f-0050-4001-a6f9-6462f6e5941e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6974b05f-0050-4001-a6f9-6462f6e5941e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-12b1a58ad098","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-6974b05f-0050-4001-a6f9-6462f6e5941e
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
Location: /v1/conversations/cnv_ae1bced3-e1fc-43a0-8663-21a50f2ae9ed
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ae1bced3-e1fc-43a0-8663-21a50f2ae9ed","subject":"Error contract","status":"open","region":"eu","participants":["qa-6ec825027c7c","qa-12b1a58ad098"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.347042567Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-fac55400-d6ea-4128-b1b2-8e3dc7dbc68d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fac55400-d6ea-4128-b1b2-8e3dc7dbc68d
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fac55400-d6ea-4128-b1b2-8e3dc7dbc68d
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-fac55400-d6ea-4128-b1b2-8e3dc7dbc68d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5d71871c-8dd9-4741-950b-39f85adc4943

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d71871c-8dd9-4741-950b-39f85adc4943
Content-Type: application/json

--- request body ---
{"handle":"qa-12b1a58ad098","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d71871c-8dd9-4741-950b-39f85adc4943
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c46570cc-8339-4eb9-b655-0e478d343e23"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-efb3c31e-45ba-4d28-bf46-34fee1507a3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efb3c31e-45ba-4d28-bf46-34fee1507a3f
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-efb3c31e-45ba-4d28-bf46-34fee1507a3f
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
correlation: qa-1974c827-6dd8-4977-a4b8-f382be09f305

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1974c827-6dd8-4977-a4b8-f382be09f305
Content-Type: application/json

--- request body ---
{"handle":"qa-12b1a58ad098","password":"****"}

--- response: 401 in 32 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1974c827-6dd8-4977-a4b8-f382be09f305
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1974c827-6dd8-4977-a4b8-f382be09f305"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0da78495-3f9f-459b-9a0e-53cc9e56a208

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0da78495-3f9f-459b-9a0e-53cc9e56a208
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0da78495-3f9f-459b-9a0e-53cc9e56a208
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
correlation: qa-166e57bd-8634-48cc-ac7c-f2c4b0dfdbe1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-166e57bd-8634-48cc-ac7c-f2c4b0dfdbe1
Content-Type: application/json

--- request body ---
{"handle":"qa-6ec825027c7c","password":"****"}

--- response: 401 in 2 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-166e57bd-8634-48cc-ac7c-f2c4b0dfdbe1
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-166e57bd-8634-48cc-ac7c-f2c4b0dfdbe1"}
```
