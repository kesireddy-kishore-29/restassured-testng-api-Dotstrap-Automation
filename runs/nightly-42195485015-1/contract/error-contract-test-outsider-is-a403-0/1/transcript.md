# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-1b3ff0bd-c591-4340-82bb-7f6de38e2402` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-94733377-6e2f-4c79-bbb8-cef38f9ab3eb` |
| 3 | `POST /v1/accounts` | 201 | 65 | `qa-504671c7-e06f-4e5b-a2ac-6f862ac2b0f7` |
| 4 | `POST /v1/auth/token` | 200 | 40 | `qa-45e10fbb-fe57-4974-8526-364f61c50103` |
| 5 | `POST /v1/conversations` | 201 | 28 | `qa-3516dec8-a591-4214-9429-c403da9c40fb` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-f86b02e0-247a-4a24-bd8d-c2e4d8f1680d` |
| 7 | `GET /v1/conversations/{id}` | 403 | 15 | `qa-fd133472-5532-4d0a-af7c-a2e17e4debb4` |
| 8 | `DELETE /v1/accounts/me` | 204 | 46 | `qa-c7c61557-4484-4d10-925e-788358e983ed` |
| 9 | `POST /v1/auth/token` | 401 | 34 | `qa-c479debe-33d9-49a2-ac81-df0824447bd0` |
| 10 | `POST /v1/auth/token` | 200 | 58 | `qa-ca2be484-c365-4575-b0d4-76521ed586a7` |
| 11 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-3623d0b0-3333-4d47-a504-7e3cd1cdbb1d` |
| 12 | `POST /v1/auth/token` | 401 | 25 | `qa-021d67ac-ca54-4490-9315-554cc8d89189` |
| 13 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-5a2956de-6709-4e68-a584-89b1cbf348df` |
| 14 | `POST /v1/auth/token` | 401 | 34 | `qa-b9c810f8-df1c-4bfd-a494-8aa525ea2eea` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1b3ff0bd-c591-4340-82bb-7f6de38e2402

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b3ff0bd-c591-4340-82bb-7f6de38e2402
Content-Type: application/json

--- request body ---
{"handle":"qa-8e5ea78d3a89","displayName":"QA 8e5ea78d3a89","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b3ff0bd-c591-4340-82bb-7f6de38e2402
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
Location: /v1/accounts/qa-8e5ea78d3a89
X-Served-Region: eu
Content-Length: 181

{"id":"acc_45d2dee5-f7aa-43f7-bd1f-641b58a86151","handle":"qa-8e5ea78d3a89","displayName":"QA 8e5ea78d3a89","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.420191430Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-94733377-6e2f-4c79-bbb8-cef38f9ab3eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94733377-6e2f-4c79-bbb8-cef38f9ab3eb
Content-Type: application/json

--- request body ---
{"handle":"qa-698ee30b4c18","displayName":"QA 698ee30b4c18","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-94733377-6e2f-4c79-bbb8-cef38f9ab3eb
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
Location: /v1/accounts/qa-698ee30b4c18
X-Served-Region: eu
Content-Length: 181

{"id":"acc_331371c5-5352-4cf1-b537-3a5a4dd31e3b","handle":"qa-698ee30b4c18","displayName":"QA 698ee30b4c18","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.459090322Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-504671c7-e06f-4e5b-a2ac-6f862ac2b0f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-504671c7-e06f-4e5b-a2ac-6f862ac2b0f7
Content-Type: application/json

--- request body ---
{"handle":"qa-2d16743649d0","displayName":"QA 2d16743649d0","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-504671c7-e06f-4e5b-a2ac-6f862ac2b0f7
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
Location: /v1/accounts/qa-2d16743649d0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_240e6c54-5f31-4d99-a30d-cdc01de8e1d1","handle":"qa-2d16743649d0","displayName":"QA 2d16743649d0","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.555697171Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-45e10fbb-fe57-4974-8526-364f61c50103

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45e10fbb-fe57-4974-8526-364f61c50103
Content-Type: application/json

--- request body ---
{"handle":"qa-8e5ea78d3a89","password":"****"}

--- response: 200 in 40 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-45e10fbb-fe57-4974-8526-364f61c50103
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_45d2dee5-f7aa-43f7-bd1f-641b58a86151"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-3516dec8-a591-4214-9429-c403da9c40fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3516dec8-a591-4214-9429-c403da9c40fb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-698ee30b4c18","subject":"Error contract","message":"Hi"}

--- response: 201 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-3516dec8-a591-4214-9429-c403da9c40fb
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
Location: /v1/conversations/cnv_678b9bdc-764a-4356-9fb1-79131f212cff
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_678b9bdc-764a-4356-9fb1-79131f212cff","subject":"Error contract","status":"open","region":"eu","participants":["qa-8e5ea78d3a89","qa-698ee30b4c18"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.680866746Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f86b02e0-247a-4a24-bd8d-c2e4d8f1680d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f86b02e0-247a-4a24-bd8d-c2e4d8f1680d
Content-Type: application/json

--- request body ---
{"handle":"qa-2d16743649d0","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f86b02e0-247a-4a24-bd8d-c2e4d8f1680d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_240e6c54-5f31-4d99-a30d-cdc01de8e1d1"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_678b9bdc-764a-4356-9fb1-79131f212cff
correlation: qa-fd133472-5532-4d0a-af7c-a2e17e4debb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd133472-5532-4d0a-af7c-a2e17e4debb4
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd133472-5532-4d0a-af7c-a2e17e4debb4
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_678b9bdc-764a-4356-9fb1-79131f212cff","correlationId":"qa-fd133472-5532-4d0a-af7c-a2e17e4debb4"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c7c61557-4484-4d10-925e-788358e983ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7c61557-4484-4d10-925e-788358e983ed
Content-Type: application/json

--- response: 204 in 46 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c7c61557-4484-4d10-925e-788358e983ed
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
correlation: qa-c479debe-33d9-49a2-ac81-df0824447bd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c479debe-33d9-49a2-ac81-df0824447bd0
Content-Type: application/json

--- request body ---
{"handle":"qa-2d16743649d0","password":"****"}

--- response: 401 in 34 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c479debe-33d9-49a2-ac81-df0824447bd0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c479debe-33d9-49a2-ac81-df0824447bd0"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ca2be484-c365-4575-b0d4-76521ed586a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca2be484-c365-4575-b0d4-76521ed586a7
Content-Type: application/json

--- request body ---
{"handle":"qa-698ee30b4c18","password":"****"}

--- response: 200 in 58 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca2be484-c365-4575-b0d4-76521ed586a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_331371c5-5352-4cf1-b537-3a5a4dd31e3b"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3623d0b0-3333-4d47-a504-7e3cd1cdbb1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3623d0b0-3333-4d47-a504-7e3cd1cdbb1d
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3623d0b0-3333-4d47-a504-7e3cd1cdbb1d
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
correlation: qa-021d67ac-ca54-4490-9315-554cc8d89189

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-021d67ac-ca54-4490-9315-554cc8d89189
Content-Type: application/json

--- request body ---
{"handle":"qa-698ee30b4c18","password":"****"}

--- response: 401 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-021d67ac-ca54-4490-9315-554cc8d89189
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-021d67ac-ca54-4490-9315-554cc8d89189"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5a2956de-6709-4e68-a584-89b1cbf348df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a2956de-6709-4e68-a584-89b1cbf348df
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5a2956de-6709-4e68-a584-89b1cbf348df
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
correlation: qa-b9c810f8-df1c-4bfd-a494-8aa525ea2eea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9c810f8-df1c-4bfd-a494-8aa525ea2eea
Content-Type: application/json

--- request body ---
{"handle":"qa-8e5ea78d3a89","password":"****"}

--- response: 401 in 34 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b9c810f8-df1c-4bfd-a494-8aa525ea2eea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b9c810f8-df1c-4bfd-a494-8aa525ea2eea"}
```
