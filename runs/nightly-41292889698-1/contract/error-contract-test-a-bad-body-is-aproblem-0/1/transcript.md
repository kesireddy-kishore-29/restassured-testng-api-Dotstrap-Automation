# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 393 | `qa-e8a0a8be-f3c9-41c2-8433-e95be7c67139` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-2bb28b0a-a460-49d1-9c8e-fd535cf975ff` |
| 3 | `POST /v1/auth/token` | 200 | 56 | `qa-08bebf20-1aea-42eb-947f-de6a3ddd254d` |
| 4 | `POST /v1/conversations` | 201 | 59 | `qa-a5d1036b-a253-4f37-b39d-b1d0474ed29e` |
| 5 | `POST /v1/auth/token` | 400 | 35 | `qa-2ef34c9a-1ef1-407b-b3ad-ce7ef7dda11a` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-960ce5fd-6038-4f14-b45d-c4cf7481d7c2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-501442ad-4a89-4461-b9f9-ae017fe36c50` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-5256dbf9-e12b-42bd-aff9-22e299cbb9ea` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-bdb04a56-dbfe-4a53-bdea-70dc6ec36fbe` |
| 10 | `POST /v1/auth/token` | 401 | 32 | `qa-c411bebf-2db1-4f54-97f9-39f4eb365dc4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e8a0a8be-f3c9-41c2-8433-e95be7c67139

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8a0a8be-f3c9-41c2-8433-e95be7c67139
Content-Type: application/json

--- request body ---
{"handle":"qa-230d30568ff0","displayName":"QA 230d30568ff0","password":"****","region":"eu"}

--- response: 201 in 393 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8a0a8be-f3c9-41c2-8433-e95be7c67139
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-230d30568ff0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f4b6b42b-1aa8-4c26-a640-a8a7d25d1e0c","handle":"qa-230d30568ff0","displayName":"QA 230d30568ff0","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.405213580Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2bb28b0a-a460-49d1-9c8e-fd535cf975ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bb28b0a-a460-49d1-9c8e-fd535cf975ff
Content-Type: application/json

--- request body ---
{"handle":"qa-63bdaa2119de","displayName":"QA 63bdaa2119de","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bb28b0a-a460-49d1-9c8e-fd535cf975ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Location: /v1/accounts/qa-63bdaa2119de
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8f88ef0e-b225-48eb-a4ae-f3704827d258","handle":"qa-63bdaa2119de","displayName":"QA 63bdaa2119de","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.789842851Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-08bebf20-1aea-42eb-947f-de6a3ddd254d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08bebf20-1aea-42eb-947f-de6a3ddd254d
Content-Type: application/json

--- request body ---
{"handle":"qa-230d30568ff0","password":"****"}

--- response: 200 in 56 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-08bebf20-1aea-42eb-947f-de6a3ddd254d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f4b6b42b-1aa8-4c26-a640-a8a7d25d1e0c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a5d1036b-a253-4f37-b39d-b1d0474ed29e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5d1036b-a253-4f37-b39d-b1d0474ed29e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-63bdaa2119de","subject":"Error contract","message":"Hi"}

--- response: 201 in 59 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5d1036b-a253-4f37-b39d-b1d0474ed29e
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
Location: /v1/conversations/cnv_10014cf6-8209-4a63-af4a-4f63174f1019
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_10014cf6-8209-4a63-af4a-4f63174f1019","subject":"Error contract","status":"open","region":"eu","participants":["qa-230d30568ff0","qa-63bdaa2119de"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:20.998183051Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2ef34c9a-1ef1-407b-b3ad-ce7ef7dda11a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ef34c9a-1ef1-407b-b3ad-ce7ef7dda11a
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 35 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ef34c9a-1ef1-407b-b3ad-ce7ef7dda11a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 10
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-2ef34c9a-1ef1-407b-b3ad-ce7ef7dda11a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-960ce5fd-6038-4f14-b45d-c4cf7481d7c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-960ce5fd-6038-4f14-b45d-c4cf7481d7c2
Content-Type: application/json

--- request body ---
{"handle":"qa-63bdaa2119de","password":"****"}

--- response: 200 in 51 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-960ce5fd-6038-4f14-b45d-c4cf7481d7c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8f88ef0e-b225-48eb-a4ae-f3704827d258"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-501442ad-4a89-4461-b9f9-ae017fe36c50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-501442ad-4a89-4461-b9f9-ae017fe36c50
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-501442ad-4a89-4461-b9f9-ae017fe36c50
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
correlation: qa-5256dbf9-e12b-42bd-aff9-22e299cbb9ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5256dbf9-e12b-42bd-aff9-22e299cbb9ea
Content-Type: application/json

--- request body ---
{"handle":"qa-63bdaa2119de","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5256dbf9-e12b-42bd-aff9-22e299cbb9ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5256dbf9-e12b-42bd-aff9-22e299cbb9ea"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bdb04a56-dbfe-4a53-bdea-70dc6ec36fbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdb04a56-dbfe-4a53-bdea-70dc6ec36fbe
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bdb04a56-dbfe-4a53-bdea-70dc6ec36fbe
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
correlation: qa-c411bebf-2db1-4f54-97f9-39f4eb365dc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c411bebf-2db1-4f54-97f9-39f4eb365dc4
Content-Type: application/json

--- request body ---
{"handle":"qa-230d30568ff0","password":"****"}

--- response: 401 in 32 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c411bebf-2db1-4f54-97f9-39f4eb365dc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c411bebf-2db1-4f54-97f9-39f4eb365dc4"}
```
