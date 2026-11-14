# Transcript: Every operation in the OpenAPI document answers as documented (checked per response)

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#everyOperationConformsToTheOpenApiDocument` |
| Features | FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 23 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 308 | `qa-d647259d-531b-473b-be40-bda12863e241` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-de6525ff-329d-497e-bfa2-3e09484b1f2a` |
| 3 | `GET /health` | 200 | 35 | `qa-4eec398b-ba57-4beb-bd03-0fda89528961` |
| 4 | `POST /v1/auth/token` | 200 | 21 | `qa-8ba74fa4-948c-4c23-ad99-27896da29968` |
| 5 | `GET /v1/accounts/me` | 200 | 12 | `qa-2bfa6762-2122-4ea4-ac65-d3a53a0498e3` |
| 6 | `PATCH /v1/accounts/me` | 200 | 20 | `qa-3305652e-bd7d-4fd5-aa55-680185c318e9` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 12 | `qa-c8322e78-a349-45bd-860f-ec6afea16775` |
| 8 | `POST /v1/conversations` | 201 | 8 | `qa-8ad47b13-6da7-4a85-a467-51d1d5942574` |
| 9 | `GET /v1/conversations` | 200 | 7 | `qa-440c013b-bd97-4cc2-932c-cbf1ce151db6` |
| 10 | `POST /v1/auth/token` | 200 | 16 | `qa-e4183986-43cc-4b4b-a224-123476ecbd37` |
| 11 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-16b1dc28-21ae-4de3-997d-e5e3363ae417` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 5 | `qa-fb3579e6-ef68-464b-862c-2b2af4a3f921` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 4 | `qa-50a4ffee-a1e8-466d-97b1-5d8943f8b8ff` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 12 | `qa-da2edae2-31e4-4078-9d8f-1304b0a679b2` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 11 | `qa-21dcea2b-7770-4552-8b1a-d8cf4217bdda` |
| 16 | `GET /v1/credits/balance` | 200 | 9 | `qa-8631f232-9e2b-420c-a32a-41cfd589121b` |
| 17 | `GET /v1/credits/ledger` | 200 | 9 | `qa-ebbf8370-e5cf-4ac3-a703-76cd3f20345a` |
| 18 | `POST /v1/credits/purchases` | 201 | 8 | `qa-14a401ee-8f72-410e-ac82-52e07d88bfec` |
| 19 | `GET /v1/admin/stats` | 403 | 9 | `qa-fafd2273-5ab5-4afc-80a0-3cf6b07d1c24` |
| 20 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-89b88332-d1cb-4ae7-aad0-d02fb365bff6` |
| 21 | `POST /v1/auth/token` | 401 | 52 | `qa-f10e6a1e-5774-4a28-8455-b53406954408` |
| 22 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-27557b26-d2a8-4405-8932-24478849fc50` |
| 23 | `POST /v1/auth/token` | 401 | 13 | `qa-22c05ee0-b56f-463a-8a8f-cb899bee06a1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d647259d-531b-473b-be40-bda12863e241

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d647259d-531b-473b-be40-bda12863e241
Content-Type: application/json

--- request body ---
{"handle":"qa-76f2fae81d82","displayName":"QA 76f2fae81d82","password":"****","region":"eu"}

--- response: 201 in 308 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d647259d-531b-473b-be40-bda12863e241
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-76f2fae81d82
X-Served-Region: eu
Content-Length: 181

{"id":"acc_215e6725-0cc4-4f65-8506-b13b60941a60","handle":"qa-76f2fae81d82","displayName":"QA 76f2fae81d82","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.140434555Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-de6525ff-329d-497e-bfa2-3e09484b1f2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de6525ff-329d-497e-bfa2-3e09484b1f2a
Content-Type: application/json

--- request body ---
{"handle":"qa-6a681081341c","displayName":"QA 6a681081341c","password":"****","region":"us"}

--- response: 201 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-de6525ff-329d-497e-bfa2-3e09484b1f2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-6a681081341c
X-Served-Region: us
Content-Length: 181

{"id":"acc_78813b81-fbc8-4272-b72f-cb24984d3972","handle":"qa-6a681081341c","displayName":"QA 6a681081341c","region":"us","role":"user","createdAt":"2026-11-09T09:56:01.395181256Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-4eec398b-ba57-4beb-bd03-0fda89528961

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4eec398b-ba57-4beb-bd03-0fda89528961
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-4eec398b-ba57-4beb-bd03-0fda89528961
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 95

{"status":"UP","version":"1.0.0","region":"eu","regions":["in","eu","us"],"faultsEnabled":true}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-8ba74fa4-948c-4c23-ad99-27896da29968

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ba74fa4-948c-4c23-ad99-27896da29968
Content-Type: application/json

--- request body ---
{"handle":"qa-76f2fae81d82","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ba74fa4-948c-4c23-ad99-27896da29968
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_215e6725-0cc4-4f65-8506-b13b60941a60"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-2bfa6762-2122-4ea4-ac65-d3a53a0498e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bfa6762-2122-4ea4-ac65-d3a53a0498e3
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bfa6762-2122-4ea4-ac65-d3a53a0498e3
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
Content-Length: 181

{"id":"acc_215e6725-0cc4-4f65-8506-b13b60941a60","handle":"qa-76f2fae81d82","displayName":"QA 76f2fae81d82","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.140434555Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-3305652e-bd7d-4fd5-aa55-680185c318e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3305652e-bd7d-4fd5-aa55-680185c318e9
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-3305652e-bd7d-4fd5-aa55-680185c318e9
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
Content-Length: 178

{"id":"acc_215e6725-0cc4-4f65-8506-b13b60941a60","handle":"qa-76f2fae81d82","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-09T09:56:01.140434555Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-6a681081341c
correlation: qa-c8322e78-a349-45bd-860f-ec6afea16775

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8322e78-a349-45bd-860f-ec6afea16775
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8322e78-a349-45bd-860f-ec6afea16775
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
Content-Length: 74

{"handle":"qa-6a681081341c","displayName":"QA 6a681081341c","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-8ad47b13-6da7-4a85-a467-51d1d5942574

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ad47b13-6da7-4a85-a467-51d1d5942574
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6a681081341c","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ad47b13-6da7-4a85-a467-51d1d5942574
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_b8891207-59c2-4b9e-a599-c21f76c0ecf9
X-Data-Region: us
Content-Length: 238

{"id":"cnv_b8891207-59c2-4b9e-a599-c21f76c0ecf9","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-76f2fae81d82","qa-6a681081341c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:01.575500051Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-440c013b-bd97-4cc2-932c-cbf1ce151db6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-440c013b-bd97-4cc2-932c-cbf1ce151db6
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-440c013b-bd97-4cc2-932c-cbf1ce151db6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 260

{"items":[{"id":"cnv_b8891207-59c2-4b9e-a599-c21f76c0ecf9","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-76f2fae81d82","qa-6a681081341c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:01.575500051Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e4183986-43cc-4b4b-a224-123476ecbd37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4183986-43cc-4b4b-a224-123476ecbd37
Content-Type: application/json

--- request body ---
{"handle":"qa-6a681081341c","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4183986-43cc-4b4b-a224-123476ecbd37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_78813b81-fbc8-4272-b72f-cb24984d3972"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_b8891207-59c2-4b9e-a599-c21f76c0ecf9
correlation: qa-16b1dc28-21ae-4de3-997d-e5e3363ae417

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16b1dc28-21ae-4de3-997d-e5e3363ae417
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-16b1dc28-21ae-4de3-997d-e5e3363ae417
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
X-Served-Region: us
X-Data-Region: us
Content-Length: 238

{"id":"cnv_b8891207-59c2-4b9e-a599-c21f76c0ecf9","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-76f2fae81d82","qa-6a681081341c"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-09T09:56:01.575500051Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_b8891207-59c2-4b9e-a599-c21f76c0ecf9/messages
correlation: qa-fb3579e6-ef68-464b-862c-2b2af4a3f921

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb3579e6-ef68-464b-862c-2b2af4a3f921
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb3579e6-ef68-464b-862c-2b2af4a3f921
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
X-Served-Region: us
Content-Length: 215

{"items":[{"id":"msg_9f7f6264-6eba-4e17-85e5-b89eb21c2f11","conversationId":"cnv_b8891207-59c2-4b9e-a599-c21f76c0ecf9","sender":"qa-76f2fae81d82","body":"Hi","createdAt":"2026-11-09T09:56:01.575522614Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_b8891207-59c2-4b9e-a599-c21f76c0ecf9/messages
correlation: qa-50a4ffee-a1e8-466d-97b1-5d8943f8b8ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50a4ffee-a1e8-466d-97b1-5d8943f8b8ff
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-50a4ffee-a1e8-466d-97b1-5d8943f8b8ff
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
X-Served-Region: us
Content-Length: 196

{"id":"msg_2b57c435-d485-4afd-8017-e6111998ffa4","conversationId":"cnv_b8891207-59c2-4b9e-a599-c21f76c0ecf9","sender":"qa-6a681081341c","body":"Reply","createdAt":"2026-11-09T09:56:01.651960508Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_b8891207-59c2-4b9e-a599-c21f76c0ecf9/read
correlation: qa-da2edae2-31e4-4078-9d8f-1304b0a679b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da2edae2-31e4-4078-9d8f-1304b0a679b2
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-da2edae2-31e4-4078-9d8f-1304b0a679b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 77

{"conversationId":"cnv_b8891207-59c2-4b9e-a599-c21f76c0ecf9","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_b8891207-59c2-4b9e-a599-c21f76c0ecf9/close
correlation: qa-21dcea2b-7770-4552-8b1a-d8cf4217bdda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21dcea2b-7770-4552-8b1a-d8cf4217bdda
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-21dcea2b-7770-4552-8b1a-d8cf4217bdda
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_b8891207-59c2-4b9e-a599-c21f76c0ecf9","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-76f2fae81d82","qa-6a681081341c"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-09T09:56:01.575500051Z","closedAt":"2026-11-09T09:56:01.711984204Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-8631f232-9e2b-420c-a32a-41cfd589121b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8631f232-9e2b-420c-a32a-41cfd589121b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8631f232-9e2b-420c-a32a-41cfd589121b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_215e6725-0cc4-4f65-8506-b13b60941a60"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-ebbf8370-e5cf-4ac3-a703-76cd3f20345a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebbf8370-e5cf-4ac3-a703-76cd3f20345a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebbf8370-e5cf-4ac3-a703-76cd3f20345a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 393

{"items":[{"id":"led_0e080627-e0a3-4b8c-8ad9-61d1929c24d9","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-09T09:56:01.140440383Z"},{"id":"led_b417deb6-ba55-4471-af9d-360eba32ab8e","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_b8891207-59c2-4b9e-a599-c21f76c0ecf9","createdAt":"2026-11-09T09:56:01.575475103Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-14a401ee-8f72-410e-ac82-52e07d88bfec

--- request headers ---
Accept: application/json
Idempotency-Key: qa-192a11c432d1498b87a2cdbdf6c46211
X-Correlation-Id: qa-14a401ee-8f72-410e-ac82-52e07d88bfec
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-14a401ee-8f72-410e-ac82-52e07d88bfec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_d289edaf-1e2c-4393-90e6-a7639215271a
Content-Length: 144

{"id":"pur_d289edaf-1e2c-4393-90e6-a7639215271a","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-09T09:56:01.761490608Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-fafd2273-5ab5-4afc-80a0-3cf6b07d1c24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fafd2273-5ab5-4afc-80a0-3cf6b07d1c24
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fafd2273-5ab5-4afc-80a0-3cf6b07d1c24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-fafd2273-5ab5-4afc-80a0-3cf6b07d1c24"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-89b88332-d1cb-4ae7-aad0-d02fb365bff6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89b88332-d1cb-4ae7-aad0-d02fb365bff6
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-89b88332-d1cb-4ae7-aad0-d02fb365bff6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: us
```

## 21. POST /v1/auth/token

```text
#21 POST http://localhost:7070/v1/auth/token
correlation: qa-f10e6a1e-5774-4a28-8455-b53406954408

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f10e6a1e-5774-4a28-8455-b53406954408
Content-Type: application/json

--- request body ---
{"handle":"qa-6a681081341c","password":"****"}

--- response: 401 in 52 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f10e6a1e-5774-4a28-8455-b53406954408
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f10e6a1e-5774-4a28-8455-b53406954408"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27557b26-d2a8-4405-8932-24478849fc50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27557b26-d2a8-4405-8932-24478849fc50
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27557b26-d2a8-4405-8932-24478849fc50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
```

## 23. POST /v1/auth/token

```text
#23 POST http://localhost:7070/v1/auth/token
correlation: qa-22c05ee0-b56f-463a-8a8f-cb899bee06a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22c05ee0-b56f-463a-8a8f-cb899bee06a1
Content-Type: application/json

--- request body ---
{"handle":"qa-76f2fae81d82","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22c05ee0-b56f-463a-8a8f-cb899bee06a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22c05ee0-b56f-463a-8a8f-cb899bee06a1"}
```
