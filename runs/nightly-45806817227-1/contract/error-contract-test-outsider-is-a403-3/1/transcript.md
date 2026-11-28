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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-5bd7d74f-922f-480a-8883-713d8b2dfae9` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-cbcbcf78-dfa9-45aa-90b9-29ed8badcead` |
| 3 | `POST /v1/accounts` | 201 | 25 | `qa-f37532e5-e457-4337-9e01-ebe48b4e8717` |
| 4 | `POST /v1/auth/token` | 200 | 21 | `qa-733515ef-832d-4334-b0bf-b3efeae3e552` |
| 5 | `POST /v1/conversations` | 201 | 16 | `qa-faf48e97-3a9c-46aa-8b6e-d71d7dff6be2` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-5170d3ef-1cfd-447b-85d4-7358871f34ca` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 15 | `qa-44cfa9e2-f8d8-432f-9d09-fd47ef10437f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 43 | `qa-1404a3e7-507d-49f6-9253-4691daa34e28` |
| 9 | `POST /v1/auth/token` | 401 | 39 | `qa-a8dfafed-73e8-4e61-ac5d-df4291fce44d` |
| 10 | `POST /v1/auth/token` | 200 | 48 | `qa-be659a77-2f5b-494c-8fba-9a2872e9ec83` |
| 11 | `DELETE /v1/accounts/me` | 204 | 45 | `qa-9448693f-16d6-4077-83e1-ae0b29226386` |
| 12 | `POST /v1/auth/token` | 401 | 33 | `qa-03f38a61-8cef-4c3f-8efb-dc6460ad06ad` |
| 13 | `DELETE /v1/accounts/me` | 204 | 52 | `qa-1df4207e-c77b-4d76-b4ad-03bf4bf7912b` |
| 14 | `POST /v1/auth/token` | 401 | 35 | `qa-32946410-bc13-4c7d-80ec-14fab58b1d56` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5bd7d74f-922f-480a-8883-713d8b2dfae9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bd7d74f-922f-480a-8883-713d8b2dfae9
Content-Type: application/json

--- request body ---
{"handle":"qa-c0e4c3ea1546","displayName":"QA c0e4c3ea1546","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bd7d74f-922f-480a-8883-713d8b2dfae9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Location: /v1/accounts/qa-c0e4c3ea1546
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9e001bb7-6d25-4a48-af6d-3be5e772d50f","handle":"qa-c0e4c3ea1546","displayName":"QA c0e4c3ea1546","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.895435425Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cbcbcf78-dfa9-45aa-90b9-29ed8badcead

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbcbcf78-dfa9-45aa-90b9-29ed8badcead
Content-Type: application/json

--- request body ---
{"handle":"qa-f1661947647a","displayName":"QA f1661947647a","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbcbcf78-dfa9-45aa-90b9-29ed8badcead
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
Location: /v1/accounts/qa-f1661947647a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2d82c004-154e-4256-8733-2f62f9de2a8d","handle":"qa-f1661947647a","displayName":"QA f1661947647a","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.926346054Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-f37532e5-e457-4337-9e01-ebe48b4e8717

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f37532e5-e457-4337-9e01-ebe48b4e8717
Content-Type: application/json

--- request body ---
{"handle":"qa-134a5d37352c","displayName":"QA 134a5d37352c","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-f37532e5-e457-4337-9e01-ebe48b4e8717
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
Location: /v1/accounts/qa-134a5d37352c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_55ea38e5-a7c8-477f-b889-30d2fd3b27db","handle":"qa-134a5d37352c","displayName":"QA 134a5d37352c","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.965700362Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-733515ef-832d-4334-b0bf-b3efeae3e552

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-733515ef-832d-4334-b0bf-b3efeae3e552
Content-Type: application/json

--- request body ---
{"handle":"qa-c0e4c3ea1546","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-733515ef-832d-4334-b0bf-b3efeae3e552
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e001bb7-6d25-4a48-af6d-3be5e772d50f"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-faf48e97-3a9c-46aa-8b6e-d71d7dff6be2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faf48e97-3a9c-46aa-8b6e-d71d7dff6be2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f1661947647a","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-faf48e97-3a9c-46aa-8b6e-d71d7dff6be2
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
Location: /v1/conversations/cnv_dc166110-efe0-4a17-8156-e1db2aaa4dcc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_dc166110-efe0-4a17-8156-e1db2aaa4dcc","subject":"Error contract","status":"open","region":"eu","participants":["qa-c0e4c3ea1546","qa-f1661947647a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:44.036766259Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5170d3ef-1cfd-447b-85d4-7358871f34ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5170d3ef-1cfd-447b-85d4-7358871f34ca
Content-Type: application/json

--- request body ---
{"handle":"qa-134a5d37352c","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-5170d3ef-1cfd-447b-85d4-7358871f34ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_55ea38e5-a7c8-477f-b889-30d2fd3b27db"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_dc166110-efe0-4a17-8156-e1db2aaa4dcc/read
correlation: qa-44cfa9e2-f8d8-432f-9d09-fd47ef10437f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44cfa9e2-f8d8-432f-9d09-fd47ef10437f
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44cfa9e2-f8d8-432f-9d09-fd47ef10437f
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_dc166110-efe0-4a17-8156-e1db2aaa4dcc/read","correlationId":"qa-44cfa9e2-f8d8-432f-9d09-fd47ef10437f"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1404a3e7-507d-49f6-9253-4691daa34e28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1404a3e7-507d-49f6-9253-4691daa34e28
Content-Type: application/json

--- response: 204 in 43 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1404a3e7-507d-49f6-9253-4691daa34e28
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
correlation: qa-a8dfafed-73e8-4e61-ac5d-df4291fce44d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8dfafed-73e8-4e61-ac5d-df4291fce44d
Content-Type: application/json

--- request body ---
{"handle":"qa-134a5d37352c","password":"****"}

--- response: 401 in 39 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8dfafed-73e8-4e61-ac5d-df4291fce44d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a8dfafed-73e8-4e61-ac5d-df4291fce44d"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-be659a77-2f5b-494c-8fba-9a2872e9ec83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be659a77-2f5b-494c-8fba-9a2872e9ec83
Content-Type: application/json

--- request body ---
{"handle":"qa-f1661947647a","password":"****"}

--- response: 200 in 48 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-be659a77-2f5b-494c-8fba-9a2872e9ec83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2d82c004-154e-4256-8733-2f62f9de2a8d"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9448693f-16d6-4077-83e1-ae0b29226386

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9448693f-16d6-4077-83e1-ae0b29226386
Content-Type: application/json

--- response: 204 in 45 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9448693f-16d6-4077-83e1-ae0b29226386
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
correlation: qa-03f38a61-8cef-4c3f-8efb-dc6460ad06ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03f38a61-8cef-4c3f-8efb-dc6460ad06ad
Content-Type: application/json

--- request body ---
{"handle":"qa-f1661947647a","password":"****"}

--- response: 401 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03f38a61-8cef-4c3f-8efb-dc6460ad06ad
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03f38a61-8cef-4c3f-8efb-dc6460ad06ad"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1df4207e-c77b-4d76-b4ad-03bf4bf7912b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1df4207e-c77b-4d76-b4ad-03bf4bf7912b
Content-Type: application/json

--- response: 204 in 52 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1df4207e-c77b-4d76-b4ad-03bf4bf7912b
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
correlation: qa-32946410-bc13-4c7d-80ec-14fab58b1d56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32946410-bc13-4c7d-80ec-14fab58b1d56
Content-Type: application/json

--- request body ---
{"handle":"qa-c0e4c3ea1546","password":"****"}

--- response: 401 in 35 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32946410-bc13-4c7d-80ec-14fab58b1d56
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-32946410-bc13-4c7d-80ec-14fab58b1d56"}
```
