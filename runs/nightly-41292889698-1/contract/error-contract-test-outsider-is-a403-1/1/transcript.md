# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 390 | `qa-914841df-8399-44ad-9cb9-68e661b0a6c0` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-5994fb3b-a8f4-40b5-aa06-e6055ef41cd3` |
| 3 | `POST /v1/accounts` | 201 | 61 | `qa-5e789b58-0044-443d-9b8b-3d2a46bf2076` |
| 4 | `POST /v1/auth/token` | 200 | 47 | `qa-c68cc2e1-7f00-4b85-89fb-5ab80df8adc9` |
| 5 | `POST /v1/conversations` | 201 | 10 | `qa-8d961f75-fa6b-4c2e-a170-d48ff4eb5f7a` |
| 6 | `POST /v1/auth/token` | 200 | 61 | `qa-dbfa3a58-93e1-49ac-acda-45169b11230d` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 27 | `qa-397082f1-6c18-43a8-a1a6-24ed54bf4453` |
| 8 | `DELETE /v1/accounts/me` | 204 | 55 | `qa-35acd7a8-7795-43c9-8deb-e34513cbe817` |
| 9 | `POST /v1/auth/token` | 401 | 34 | `qa-78d1eb5d-e665-48bc-af95-d6281f5252b0` |
| 10 | `POST /v1/auth/token` | 200 | 46 | `qa-6a8d93ae-4874-43ee-9cb7-9359d981f5f8` |
| 11 | `DELETE /v1/accounts/me` | 204 | 67 | `qa-5150af21-b0b4-4e97-981f-6cb2d0395fcd` |
| 12 | `POST /v1/auth/token` | 401 | 29 | `qa-22ac4cc3-0008-43da-8e1a-bfa4dfc0f04f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-daf1cf2e-9ba3-4288-bc65-6c605c26a719` |
| 14 | `POST /v1/auth/token` | 401 | 27 | `qa-fef073ab-c184-49f4-8bbe-53a50226c355` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-914841df-8399-44ad-9cb9-68e661b0a6c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-914841df-8399-44ad-9cb9-68e661b0a6c0
Content-Type: application/json

--- request body ---
{"handle":"qa-7e7c555c8ef6","displayName":"QA 7e7c555c8ef6","password":"****","region":"eu"}

--- response: 201 in 390 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-914841df-8399-44ad-9cb9-68e661b0a6c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Location: /v1/accounts/qa-7e7c555c8ef6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_128dcce9-b9ce-4769-a446-140590245927","handle":"qa-7e7c555c8ef6","displayName":"QA 7e7c555c8ef6","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.340222681Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5994fb3b-a8f4-40b5-aa06-e6055ef41cd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5994fb3b-a8f4-40b5-aa06-e6055ef41cd3
Content-Type: application/json

--- request body ---
{"handle":"qa-d686e3d81117","displayName":"QA d686e3d81117","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-5994fb3b-a8f4-40b5-aa06-e6055ef41cd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Location: /v1/accounts/qa-d686e3d81117
X-Served-Region: eu
Content-Length: 181

{"id":"acc_098abdb9-ce99-4ea5-bf93-8abd4ed5b027","handle":"qa-d686e3d81117","displayName":"QA d686e3d81117","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.806604412Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-5e789b58-0044-443d-9b8b-3d2a46bf2076

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e789b58-0044-443d-9b8b-3d2a46bf2076
Content-Type: application/json

--- request body ---
{"handle":"qa-96905f0d6c59","displayName":"QA 96905f0d6c59","password":"****","region":"eu"}

--- response: 201 in 61 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e789b58-0044-443d-9b8b-3d2a46bf2076
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Location: /v1/accounts/qa-96905f0d6c59
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1eb3b5a3-0c18-473d-9ed0-09a24262aed4","handle":"qa-96905f0d6c59","displayName":"QA 96905f0d6c59","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.873971977Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c68cc2e1-7f00-4b85-89fb-5ab80df8adc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c68cc2e1-7f00-4b85-89fb-5ab80df8adc9
Content-Type: application/json

--- request body ---
{"handle":"qa-7e7c555c8ef6","password":"****"}

--- response: 200 in 47 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-c68cc2e1-7f00-4b85-89fb-5ab80df8adc9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_128dcce9-b9ce-4769-a446-140590245927"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-8d961f75-fa6b-4c2e-a170-d48ff4eb5f7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d961f75-fa6b-4c2e-a170-d48ff4eb5f7a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d686e3d81117","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d961f75-fa6b-4c2e-a170-d48ff4eb5f7a
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
Location: /v1/conversations/cnv_450a7550-70e9-4bfd-862a-985f7105e685
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_450a7550-70e9-4bfd-862a-985f7105e685","subject":"Error contract","status":"open","region":"eu","participants":["qa-7e7c555c8ef6","qa-d686e3d81117"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:21.022478017Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dbfa3a58-93e1-49ac-acda-45169b11230d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbfa3a58-93e1-49ac-acda-45169b11230d
Content-Type: application/json

--- request body ---
{"handle":"qa-96905f0d6c59","password":"****"}

--- response: 200 in 61 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbfa3a58-93e1-49ac-acda-45169b11230d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1eb3b5a3-0c18-473d-9ed0-09a24262aed4"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_450a7550-70e9-4bfd-862a-985f7105e685/messages
correlation: qa-397082f1-6c18-43a8-a1a6-24ed54bf4453

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-397082f1-6c18-43a8-a1a6-24ed54bf4453
Content-Type: application/json

--- response: 403 in 27 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-397082f1-6c18-43a8-a1a6-24ed54bf4453
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_450a7550-70e9-4bfd-862a-985f7105e685/messages","correlationId":"qa-397082f1-6c18-43a8-a1a6-24ed54bf4453"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35acd7a8-7795-43c9-8deb-e34513cbe817

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35acd7a8-7795-43c9-8deb-e34513cbe817
Content-Type: application/json

--- response: 204 in 55 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35acd7a8-7795-43c9-8deb-e34513cbe817
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
correlation: qa-78d1eb5d-e665-48bc-af95-d6281f5252b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78d1eb5d-e665-48bc-af95-d6281f5252b0
Content-Type: application/json

--- request body ---
{"handle":"qa-96905f0d6c59","password":"****"}

--- response: 401 in 34 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78d1eb5d-e665-48bc-af95-d6281f5252b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-78d1eb5d-e665-48bc-af95-d6281f5252b0"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-6a8d93ae-4874-43ee-9cb7-9359d981f5f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a8d93ae-4874-43ee-9cb7-9359d981f5f8
Content-Type: application/json

--- request body ---
{"handle":"qa-d686e3d81117","password":"****"}

--- response: 200 in 46 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a8d93ae-4874-43ee-9cb7-9359d981f5f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_098abdb9-ce99-4ea5-bf93-8abd4ed5b027"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5150af21-b0b4-4e97-981f-6cb2d0395fcd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5150af21-b0b4-4e97-981f-6cb2d0395fcd
Content-Type: application/json

--- response: 204 in 67 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5150af21-b0b4-4e97-981f-6cb2d0395fcd
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
correlation: qa-22ac4cc3-0008-43da-8e1a-bfa4dfc0f04f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22ac4cc3-0008-43da-8e1a-bfa4dfc0f04f
Content-Type: application/json

--- request body ---
{"handle":"qa-d686e3d81117","password":"****"}

--- response: 401 in 29 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22ac4cc3-0008-43da-8e1a-bfa4dfc0f04f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22ac4cc3-0008-43da-8e1a-bfa4dfc0f04f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-daf1cf2e-9ba3-4288-bc65-6c605c26a719

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daf1cf2e-9ba3-4288-bc65-6c605c26a719
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-daf1cf2e-9ba3-4288-bc65-6c605c26a719
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-fef073ab-c184-49f4-8bbe-53a50226c355

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fef073ab-c184-49f4-8bbe-53a50226c355
Content-Type: application/json

--- request body ---
{"handle":"qa-7e7c555c8ef6","password":"****"}

--- response: 401 in 27 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fef073ab-c184-49f4-8bbe-53a50226c355
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fef073ab-c184-49f4-8bbe-53a50226c355"}
```
