# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-a6685a5d-6c42-43b9-9b7f-d64b1c5171f7` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-cd962ded-cd07-4d16-baac-19fb0f45fa6d` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-c1980870-d893-42a8-a401-185fc51ef306` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-923c9cee-1d41-41e4-8182-3d2d6e399510` |
| 5 | `DELETE /v1/accounts/me` | 503 | 28 | `qa-7c5e9d53-7634-4f31-b644-873723d92088` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-a3d42383-0d0a-4479-a178-c19f6c3dc84f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-6d53d2ae-a79e-488d-a163-f3a4aed62ac9` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-f7875ba3-92de-4a22-91da-e7211fbd96c5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-c2ef4312-7232-4c86-a34a-00fb3c0eb825` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-16222ecf-038b-4136-9d8f-df4bd1d5ec3a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a6685a5d-6c42-43b9-9b7f-d64b1c5171f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6685a5d-6c42-43b9-9b7f-d64b1c5171f7
Content-Type: application/json

--- request body ---
{"handle":"qa-53dd104e0429","displayName":"QA 53dd104e0429","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6685a5d-6c42-43b9-9b7f-d64b1c5171f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Location: /v1/accounts/qa-53dd104e0429
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4d5059c8-ed29-47e6-b109-30b810c2b4fa","handle":"qa-53dd104e0429","displayName":"QA 53dd104e0429","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.366236151Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cd962ded-cd07-4d16-baac-19fb0f45fa6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd962ded-cd07-4d16-baac-19fb0f45fa6d
Content-Type: application/json

--- request body ---
{"handle":"qa-889191336a10","displayName":"QA 889191336a10","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd962ded-cd07-4d16-baac-19fb0f45fa6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Location: /v1/accounts/qa-889191336a10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6c4c82c5-efad-4c38-a279-80a632363755","handle":"qa-889191336a10","displayName":"QA 889191336a10","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.401503266Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c1980870-d893-42a8-a401-185fc51ef306

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1980870-d893-42a8-a401-185fc51ef306
Content-Type: application/json

--- request body ---
{"handle":"qa-53dd104e0429","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1980870-d893-42a8-a401-185fc51ef306
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4d5059c8-ed29-47e6-b109-30b810c2b4fa"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-923c9cee-1d41-41e4-8182-3d2d6e399510

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-923c9cee-1d41-41e4-8182-3d2d6e399510
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-889191336a10","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-923c9cee-1d41-41e4-8182-3d2d6e399510
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
Location: /v1/conversations/cnv_5cd7ea39-397c-4280-9b7e-81c9448ef27f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5cd7ea39-397c-4280-9b7e-81c9448ef27f","subject":"Error contract","status":"open","region":"eu","participants":["qa-53dd104e0429","qa-889191336a10"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:58.479889632Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7c5e9d53-7634-4f31-b644-873723d92088

--- request headers ---
Accept: application/json
X-Fault-Key: fb155d32-751c-4b4b-b5ce-9889f471e77c
X-Fault: unavailable-once
X-Correlation-Id: qa-7c5e9d53-7634-4f31-b644-873723d92088
Content-Type: application/json

--- response: 503 in 28 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c5e9d53-7634-4f31-b644-873723d92088
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-7c5e9d53-7634-4f31-b644-873723d92088"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a3d42383-0d0a-4479-a178-c19f6c3dc84f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3d42383-0d0a-4479-a178-c19f6c3dc84f
Content-Type: application/json

--- request body ---
{"handle":"qa-889191336a10","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3d42383-0d0a-4479-a178-c19f6c3dc84f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6c4c82c5-efad-4c38-a279-80a632363755"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d53d2ae-a79e-488d-a163-f3a4aed62ac9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d53d2ae-a79e-488d-a163-f3a4aed62ac9
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d53d2ae-a79e-488d-a163-f3a4aed62ac9
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
correlation: qa-f7875ba3-92de-4a22-91da-e7211fbd96c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7875ba3-92de-4a22-91da-e7211fbd96c5
Content-Type: application/json

--- request body ---
{"handle":"qa-889191336a10","password":"****"}

--- response: 401 in 22 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7875ba3-92de-4a22-91da-e7211fbd96c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f7875ba3-92de-4a22-91da-e7211fbd96c5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c2ef4312-7232-4c86-a34a-00fb3c0eb825

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2ef4312-7232-4c86-a34a-00fb3c0eb825
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c2ef4312-7232-4c86-a34a-00fb3c0eb825
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
correlation: qa-16222ecf-038b-4136-9d8f-df4bd1d5ec3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16222ecf-038b-4136-9d8f-df4bd1d5ec3a
Content-Type: application/json

--- request body ---
{"handle":"qa-53dd104e0429","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16222ecf-038b-4136-9d8f-df4bd1d5ec3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-16222ecf-038b-4136-9d8f-df4bd1d5ec3a"}
```
