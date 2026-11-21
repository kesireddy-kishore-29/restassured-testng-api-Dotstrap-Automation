# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-2e9d5167-711b-4c17-be9e-615475382738` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-50841540-6e13-4117-9b67-1615c5de58a6` |
| 3 | `POST /v1/accounts` | 201 | 24 | `qa-cdcc3435-e223-4efc-b74a-5a08468edd1d` |
| 4 | `POST /v1/auth/token` | 200 | 13 | `qa-0b22b9f0-1a5b-46be-af3e-274fbf915042` |
| 5 | `POST /v1/conversations` | 201 | 19 | `qa-867f57cd-8241-455c-9423-fb2c13a34e92` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-649f097c-cfe1-4c74-9287-501e737733d3` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 6 | `qa-6b038099-9fa1-4e93-bc52-3a9fd2601b43` |
| 8 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-a58bd6d0-e3dc-4382-b8d7-d0d5e6f82ada` |
| 9 | `POST /v1/auth/token` | 401 | 13 | `qa-93e98fb8-4db2-48cf-9899-29c7ce4247c4` |
| 10 | `POST /v1/auth/token` | 200 | 36 | `qa-a613ce44-e248-477e-9700-38d530b7f2c6` |
| 11 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-228445dd-0757-43d6-b8ec-5f8e0ac64870` |
| 12 | `POST /v1/auth/token` | 401 | 32 | `qa-6166288e-fb17-451c-b78f-59d9cc75af8f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-2d1e83b5-a9bd-43b0-99e3-b15a13fcc331` |
| 14 | `POST /v1/auth/token` | 401 | 53 | `qa-b095c817-db46-4c60-8c2d-0fc382de88a6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2e9d5167-711b-4c17-be9e-615475382738

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e9d5167-711b-4c17-be9e-615475382738
Content-Type: application/json

--- request body ---
{"handle":"qa-3bbc6ad662b8","displayName":"QA 3bbc6ad662b8","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e9d5167-711b-4c17-be9e-615475382738
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Location: /v1/accounts/qa-3bbc6ad662b8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0caf4d78-40a4-44cd-9b29-275dd3bcfeab","handle":"qa-3bbc6ad662b8","displayName":"QA 3bbc6ad662b8","region":"eu","role":"user","createdAt":"2026-11-16T09:53:52.083839870Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-50841540-6e13-4117-9b67-1615c5de58a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50841540-6e13-4117-9b67-1615c5de58a6
Content-Type: application/json

--- request body ---
{"handle":"qa-1ab9bf98d872","displayName":"QA 1ab9bf98d872","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-50841540-6e13-4117-9b67-1615c5de58a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Location: /v1/accounts/qa-1ab9bf98d872
X-Served-Region: eu
Content-Length: 181

{"id":"acc_74bd227d-ad45-46d9-b5f2-7219cfb6a4c3","handle":"qa-1ab9bf98d872","displayName":"QA 1ab9bf98d872","region":"eu","role":"user","createdAt":"2026-11-16T09:53:52.138914613Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-cdcc3435-e223-4efc-b74a-5a08468edd1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdcc3435-e223-4efc-b74a-5a08468edd1d
Content-Type: application/json

--- request body ---
{"handle":"qa-1b9bf9fd8742","displayName":"QA 1b9bf9fd8742","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdcc3435-e223-4efc-b74a-5a08468edd1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Location: /v1/accounts/qa-1b9bf9fd8742
X-Served-Region: eu
Content-Length: 181

{"id":"acc_21df559f-52bd-4f6b-ae3f-edf438c5e6e4","handle":"qa-1b9bf9fd8742","displayName":"QA 1b9bf9fd8742","region":"eu","role":"user","createdAt":"2026-11-16T09:53:52.168847642Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0b22b9f0-1a5b-46be-af3e-274fbf915042

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b22b9f0-1a5b-46be-af3e-274fbf915042
Content-Type: application/json

--- request body ---
{"handle":"qa-3bbc6ad662b8","password":"****"}

--- response: 200 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b22b9f0-1a5b-46be-af3e-274fbf915042
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0caf4d78-40a4-44cd-9b29-275dd3bcfeab"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-867f57cd-8241-455c-9423-fb2c13a34e92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-867f57cd-8241-455c-9423-fb2c13a34e92
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1ab9bf98d872","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-867f57cd-8241-455c-9423-fb2c13a34e92
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
Location: /v1/conversations/cnv_b51a7570-7636-46fc-b891-1f11d87d43be
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b51a7570-7636-46fc-b891-1f11d87d43be","subject":"Error contract","status":"open","region":"eu","participants":["qa-3bbc6ad662b8","qa-1ab9bf98d872"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:52.237808074Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-649f097c-cfe1-4c74-9287-501e737733d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-649f097c-cfe1-4c74-9287-501e737733d3
Content-Type: application/json

--- request body ---
{"handle":"qa-1b9bf9fd8742","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-649f097c-cfe1-4c74-9287-501e737733d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21df559f-52bd-4f6b-ae3f-edf438c5e6e4"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_b51a7570-7636-46fc-b891-1f11d87d43be/read
correlation: qa-6b038099-9fa1-4e93-bc52-3a9fd2601b43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b038099-9fa1-4e93-bc52-3a9fd2601b43
Content-Type: application/json

--- response: 403 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b038099-9fa1-4e93-bc52-3a9fd2601b43
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_b51a7570-7636-46fc-b891-1f11d87d43be/read","correlationId":"qa-6b038099-9fa1-4e93-bc52-3a9fd2601b43"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a58bd6d0-e3dc-4382-b8d7-d0d5e6f82ada

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a58bd6d0-e3dc-4382-b8d7-d0d5e6f82ada
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a58bd6d0-e3dc-4382-b8d7-d0d5e6f82ada
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
correlation: qa-93e98fb8-4db2-48cf-9899-29c7ce4247c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93e98fb8-4db2-48cf-9899-29c7ce4247c4
Content-Type: application/json

--- request body ---
{"handle":"qa-1b9bf9fd8742","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93e98fb8-4db2-48cf-9899-29c7ce4247c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93e98fb8-4db2-48cf-9899-29c7ce4247c4"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-a613ce44-e248-477e-9700-38d530b7f2c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a613ce44-e248-477e-9700-38d530b7f2c6
Content-Type: application/json

--- request body ---
{"handle":"qa-1ab9bf98d872","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a613ce44-e248-477e-9700-38d530b7f2c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_74bd227d-ad45-46d9-b5f2-7219cfb6a4c3"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-228445dd-0757-43d6-b8ec-5f8e0ac64870

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-228445dd-0757-43d6-b8ec-5f8e0ac64870
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-228445dd-0757-43d6-b8ec-5f8e0ac64870
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
correlation: qa-6166288e-fb17-451c-b78f-59d9cc75af8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6166288e-fb17-451c-b78f-59d9cc75af8f
Content-Type: application/json

--- request body ---
{"handle":"qa-1ab9bf98d872","password":"****"}

--- response: 401 in 32 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6166288e-fb17-451c-b78f-59d9cc75af8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6166288e-fb17-451c-b78f-59d9cc75af8f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d1e83b5-a9bd-43b0-99e3-b15a13fcc331

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d1e83b5-a9bd-43b0-99e3-b15a13fcc331
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d1e83b5-a9bd-43b0-99e3-b15a13fcc331
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-b095c817-db46-4c60-8c2d-0fc382de88a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b095c817-db46-4c60-8c2d-0fc382de88a6
Content-Type: application/json

--- request body ---
{"handle":"qa-3bbc6ad662b8","password":"****"}

--- response: 401 in 53 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b095c817-db46-4c60-8c2d-0fc382de88a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b095c817-db46-4c60-8c2d-0fc382de88a6"}
```
