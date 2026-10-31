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
| 1 | `POST /v1/accounts` | 201 | 325 | `qa-d2cb71ed-a33e-4d06-ad19-84a9f614c9d2` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-ac216527-1a3e-4914-aede-97dacba85099` |
| 3 | `GET /health` | 200 | 27 | `qa-52bc9a32-90c6-425c-8cec-b7b6a9e63f95` |
| 4 | `POST /v1/auth/token` | 200 | 18 | `qa-2bc0e626-665e-46c1-8668-475f7b323a74` |
| 5 | `GET /v1/accounts/me` | 200 | 33 | `qa-166bfffa-afc6-4363-8531-bf963f5e7669` |
| 6 | `PATCH /v1/accounts/me` | 200 | 20 | `qa-d6012019-b564-4427-89e5-af4a34ffed78` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 21 | `qa-7ef00d5e-eb6f-47a6-b06a-5becb1767040` |
| 8 | `POST /v1/conversations` | 201 | 12 | `qa-200f16cb-57cb-4152-ad0a-e984d228f10e` |
| 9 | `GET /v1/conversations` | 200 | 13 | `qa-b208b8e3-3031-4359-b5f2-b816316a5073` |
| 10 | `POST /v1/auth/token` | 200 | 11 | `qa-804884ce-d3a5-4988-9f65-b1ef5e9c7f83` |
| 11 | `GET /v1/conversations/{id}` | 200 | 13 | `qa-620894e3-27dd-4478-bbad-69c2984a1d46` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 38 | `qa-680c4a37-289c-4474-bfe5-846e1a8a1e37` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-12dba61b-ae4e-453c-9280-9ba0c6a8da19` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 7 | `qa-38a28fd9-01de-4121-9ea2-7d1de103ee14` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 10 | `qa-5e4b7654-d93e-4d4f-aae3-8b6affb52f9e` |
| 16 | `GET /v1/credits/balance` | 200 | 11 | `qa-2fcf18bb-f1e5-4a3f-8b80-4ddf6746ea04` |
| 17 | `GET /v1/credits/ledger` | 200 | 7 | `qa-b4c07f32-a2d3-4929-b2fa-dae71d69780b` |
| 18 | `POST /v1/credits/purchases` | 201 | 12 | `qa-968c095e-4d2c-4498-8d7f-01b2e918c1b8` |
| 19 | `GET /v1/admin/stats` | 403 | 12 | `qa-e1eb60ae-fa40-4c5d-bbb0-dd396272abaf` |
| 20 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-f4acbc1d-b8eb-41fc-816b-4ffab1e97e3a` |
| 21 | `POST /v1/auth/token` | 401 | 24 | `qa-3b49b8d4-b6dc-4b71-a071-fccd5b3d3f42` |
| 22 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-cd1763d3-804f-42c4-9526-609365fd7c10` |
| 23 | `POST /v1/auth/token` | 401 | 9 | `qa-d83c33ef-2dc8-46e7-b91f-0b1ad74485c2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d2cb71ed-a33e-4d06-ad19-84a9f614c9d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2cb71ed-a33e-4d06-ad19-84a9f614c9d2
Content-Type: application/json

--- request body ---
{"handle":"qa-b27dbc72c608","displayName":"QA b27dbc72c608","password":"****","region":"eu"}

--- response: 201 in 325 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2cb71ed-a33e-4d06-ad19-84a9f614c9d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-b27dbc72c608
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2860a481-b816-4be0-a8c0-5a7d72bb5537","handle":"qa-b27dbc72c608","displayName":"QA b27dbc72c608","region":"eu","role":"user","createdAt":"2026-10-26T07:54:45.423055275Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ac216527-1a3e-4914-aede-97dacba85099

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac216527-1a3e-4914-aede-97dacba85099
Content-Type: application/json

--- request body ---
{"handle":"qa-0098a9a80f27","displayName":"QA 0098a9a80f27","password":"****","region":"us"}

--- response: 201 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac216527-1a3e-4914-aede-97dacba85099
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-0098a9a80f27
X-Served-Region: us
Content-Length: 181

{"id":"acc_8b1d58a4-6319-4e5a-94a0-40af928d661a","handle":"qa-0098a9a80f27","displayName":"QA 0098a9a80f27","region":"us","role":"user","createdAt":"2026-10-26T07:54:45.703201173Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-52bc9a32-90c6-425c-8cec-b7b6a9e63f95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52bc9a32-90c6-425c-8cec-b7b6a9e63f95
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-52bc9a32-90c6-425c-8cec-b7b6a9e63f95
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
correlation: qa-2bc0e626-665e-46c1-8668-475f7b323a74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bc0e626-665e-46c1-8668-475f7b323a74
Content-Type: application/json

--- request body ---
{"handle":"qa-b27dbc72c608","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bc0e626-665e-46c1-8668-475f7b323a74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2860a481-b816-4be0-a8c0-5a7d72bb5537"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-166bfffa-afc6-4363-8531-bf963f5e7669

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-166bfffa-afc6-4363-8531-bf963f5e7669
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-166bfffa-afc6-4363-8531-bf963f5e7669
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

{"id":"acc_2860a481-b816-4be0-a8c0-5a7d72bb5537","handle":"qa-b27dbc72c608","displayName":"QA b27dbc72c608","region":"eu","role":"user","createdAt":"2026-10-26T07:54:45.423055275Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d6012019-b564-4427-89e5-af4a34ffed78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6012019-b564-4427-89e5-af4a34ffed78
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6012019-b564-4427-89e5-af4a34ffed78
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

{"id":"acc_2860a481-b816-4be0-a8c0-5a7d72bb5537","handle":"qa-b27dbc72c608","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-10-26T07:54:45.423055275Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-0098a9a80f27
correlation: qa-7ef00d5e-eb6f-47a6-b06a-5becb1767040

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ef00d5e-eb6f-47a6-b06a-5becb1767040
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ef00d5e-eb6f-47a6-b06a-5becb1767040
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

{"handle":"qa-0098a9a80f27","displayName":"QA 0098a9a80f27","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-200f16cb-57cb-4152-ad0a-e984d228f10e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-200f16cb-57cb-4152-ad0a-e984d228f10e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0098a9a80f27","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-200f16cb-57cb-4152-ad0a-e984d228f10e
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
Location: /v1/conversations/cnv_864d7186-2bcf-4185-b9ee-7b328d621b85
X-Data-Region: us
Content-Length: 238

{"id":"cnv_864d7186-2bcf-4185-b9ee-7b328d621b85","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-b27dbc72c608","qa-0098a9a80f27"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:45.949959969Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-b208b8e3-3031-4359-b5f2-b816316a5073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b208b8e3-3031-4359-b5f2-b816316a5073
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-b208b8e3-3031-4359-b5f2-b816316a5073
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

{"items":[{"id":"cnv_864d7186-2bcf-4185-b9ee-7b328d621b85","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-b27dbc72c608","qa-0098a9a80f27"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:45.949959969Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-804884ce-d3a5-4988-9f65-b1ef5e9c7f83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-804884ce-d3a5-4988-9f65-b1ef5e9c7f83
Content-Type: application/json

--- request body ---
{"handle":"qa-0098a9a80f27","password":"****"}

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-804884ce-d3a5-4988-9f65-b1ef5e9c7f83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b1d58a4-6319-4e5a-94a0-40af928d661a"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_864d7186-2bcf-4185-b9ee-7b328d621b85
correlation: qa-620894e3-27dd-4478-bbad-69c2984a1d46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-620894e3-27dd-4478-bbad-69c2984a1d46
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-620894e3-27dd-4478-bbad-69c2984a1d46
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

{"id":"cnv_864d7186-2bcf-4185-b9ee-7b328d621b85","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-b27dbc72c608","qa-0098a9a80f27"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-26T07:54:45.949959969Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_864d7186-2bcf-4185-b9ee-7b328d621b85/messages
correlation: qa-680c4a37-289c-4474-bfe5-846e1a8a1e37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-680c4a37-289c-4474-bfe5-846e1a8a1e37
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-680c4a37-289c-4474-bfe5-846e1a8a1e37
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

{"items":[{"id":"msg_13fc9534-0e5f-43ee-bb25-aeb431f2f702","conversationId":"cnv_864d7186-2bcf-4185-b9ee-7b328d621b85","sender":"qa-b27dbc72c608","body":"Hi","createdAt":"2026-10-26T07:54:45.949983333Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_864d7186-2bcf-4185-b9ee-7b328d621b85/messages
correlation: qa-12dba61b-ae4e-453c-9280-9ba0c6a8da19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12dba61b-ae4e-453c-9280-9ba0c6a8da19
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-12dba61b-ae4e-453c-9280-9ba0c6a8da19
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

{"id":"msg_50b09e7b-7228-4539-b571-1f9ed6acca64","conversationId":"cnv_864d7186-2bcf-4185-b9ee-7b328d621b85","sender":"qa-0098a9a80f27","body":"Reply","createdAt":"2026-10-26T07:54:46.097098506Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_864d7186-2bcf-4185-b9ee-7b328d621b85/read
correlation: qa-38a28fd9-01de-4121-9ea2-7d1de103ee14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38a28fd9-01de-4121-9ea2-7d1de103ee14
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-38a28fd9-01de-4121-9ea2-7d1de103ee14
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

{"conversationId":"cnv_864d7186-2bcf-4185-b9ee-7b328d621b85","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_864d7186-2bcf-4185-b9ee-7b328d621b85/close
correlation: qa-5e4b7654-d93e-4d4f-aae3-8b6affb52f9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e4b7654-d93e-4d4f-aae3-8b6affb52f9e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e4b7654-d93e-4d4f-aae3-8b6affb52f9e
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

{"id":"cnv_864d7186-2bcf-4185-b9ee-7b328d621b85","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-b27dbc72c608","qa-0098a9a80f27"],"messageCount":2,"unreadCount":0,"createdAt":"2026-10-26T07:54:45.949959969Z","closedAt":"2026-10-26T07:54:46.128987308Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-2fcf18bb-f1e5-4a3f-8b80-4ddf6746ea04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fcf18bb-f1e5-4a3f-8b80-4ddf6746ea04
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fcf18bb-f1e5-4a3f-8b80-4ddf6746ea04
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

{"balance":4,"currency":"credits","accountId":"acc_2860a481-b816-4be0-a8c0-5a7d72bb5537"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b4c07f32-a2d3-4929-b2fa-dae71d69780b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4c07f32-a2d3-4929-b2fa-dae71d69780b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4c07f32-a2d3-4929-b2fa-dae71d69780b
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

{"items":[{"id":"led_72a518ec-adc1-46ea-bf98-885936183cc8","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-26T07:54:45.423062556Z"},{"id":"led_df922d12-b2ef-4401-990b-b21cb69e693b","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_864d7186-2bcf-4185-b9ee-7b328d621b85","createdAt":"2026-10-26T07:54:45.949947631Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-968c095e-4d2c-4498-8d7f-01b2e918c1b8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8d7f4d8c7c924e12bc306afcc3ac2508
X-Correlation-Id: qa-968c095e-4d2c-4498-8d7f-01b2e918c1b8
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-968c095e-4d2c-4498-8d7f-01b2e918c1b8
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
Location: /v1/credits/purchases/pur_9847545a-8347-4a8c-ad53-477816570ee0
Content-Length: 144

{"id":"pur_9847545a-8347-4a8c-ad53-477816570ee0","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-10-26T07:54:46.185930810Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-e1eb60ae-fa40-4c5d-bbb0-dd396272abaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1eb60ae-fa40-4c5d-bbb0-dd396272abaf
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1eb60ae-fa40-4c5d-bbb0-dd396272abaf
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-e1eb60ae-fa40-4c5d-bbb0-dd396272abaf"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f4acbc1d-b8eb-41fc-816b-4ffab1e97e3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4acbc1d-b8eb-41fc-816b-4ffab1e97e3a
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f4acbc1d-b8eb-41fc-816b-4ffab1e97e3a
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
correlation: qa-3b49b8d4-b6dc-4b71-a071-fccd5b3d3f42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b49b8d4-b6dc-4b71-a071-fccd5b3d3f42
Content-Type: application/json

--- request body ---
{"handle":"qa-0098a9a80f27","password":"****"}

--- response: 401 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b49b8d4-b6dc-4b71-a071-fccd5b3d3f42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3b49b8d4-b6dc-4b71-a071-fccd5b3d3f42"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd1763d3-804f-42c4-9526-609365fd7c10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd1763d3-804f-42c4-9526-609365fd7c10
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd1763d3-804f-42c4-9526-609365fd7c10
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
correlation: qa-d83c33ef-2dc8-46e7-b91f-0b1ad74485c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d83c33ef-2dc8-46e7-b91f-0b1ad74485c2
Content-Type: application/json

--- request body ---
{"handle":"qa-b27dbc72c608","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d83c33ef-2dc8-46e7-b91f-0b1ad74485c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d83c33ef-2dc8-46e7-b91f-0b1ad74485c2"}
```
