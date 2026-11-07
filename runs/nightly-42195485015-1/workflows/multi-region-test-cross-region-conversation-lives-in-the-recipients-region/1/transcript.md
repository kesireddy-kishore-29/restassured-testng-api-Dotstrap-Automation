# Transcript: A cross-region conversation is stored in the recipient's region, for both sides

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#crossRegionConversationLivesInTheRecipientsRegion` |
| Features | FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 480 | `qa-253cfb3b-9532-4ac9-9772-fbf44b484aa5` |
| 2 | `POST /v1/accounts` | 201 | 83 | `qa-0ab96f10-9328-40f3-b1eb-2220fa134e3a` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-66a38245-9dd7-4997-a38f-c15fcb732f71` |
| 4 | `POST /v1/conversations` | 201 | 116 | `qa-9d41a335-4722-4767-8ef2-d83d8f1768c9` |
| 5 | `GET /v1/conversations/{id}` | 200 | 51 | `qa-17e9c17b-6c23-41ea-970d-9b03885d0001` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-7998d610-2efb-4f1a-b8c6-e6f61b35bf6d` |
| 7 | `GET /v1/conversations/{id}` | 200 | 20 | `qa-a59dc3ba-7f7e-419c-9715-1916fdde8305` |
| 8 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-fde845cf-ad4c-4c53-94aa-12e870f058d7` |
| 9 | `POST /v1/auth/token` | 401 | 25 | `qa-fb337ae3-44a6-4fe4-98dd-e588b13ad5ff` |
| 10 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-410026ee-0bd5-4118-a7eb-9c16bbd4deaa` |
| 11 | `POST /v1/auth/token` | 401 | 20 | `qa-6aefc1b3-0c2e-42d3-b8cb-eade394109a1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-253cfb3b-9532-4ac9-9772-fbf44b484aa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-253cfb3b-9532-4ac9-9772-fbf44b484aa5
Content-Type: application/json

--- request body ---
{"handle":"qa-89608b2e175e","displayName":"QA 89608b2e175e","password":"****","region":"in"}

--- response: 201 in 480 ms ---
Date: Fri, 06 Nov 2026 09:30:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-253cfb3b-9532-4ac9-9772-fbf44b484aa5
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
Location: /v1/accounts/qa-89608b2e175e
X-Served-Region: in
Content-Length: 181

{"id":"acc_cf35166a-44e0-4ba7-8687-84681c1c4ae6","handle":"qa-89608b2e175e","displayName":"QA 89608b2e175e","region":"in","role":"user","createdAt":"2026-11-06T09:30:31.035292824Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0ab96f10-9328-40f3-b1eb-2220fa134e3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ab96f10-9328-40f3-b1eb-2220fa134e3a
Content-Type: application/json

--- request body ---
{"handle":"qa-79e2accad4d4","displayName":"QA 79e2accad4d4","password":"****","region":"eu"}

--- response: 201 in 83 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ab96f10-9328-40f3-b1eb-2220fa134e3a
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
Location: /v1/accounts/qa-79e2accad4d4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1f29657f-923a-4747-a2c8-043464892e19","handle":"qa-79e2accad4d4","displayName":"QA 79e2accad4d4","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.571866175Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-66a38245-9dd7-4997-a38f-c15fcb732f71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66a38245-9dd7-4997-a38f-c15fcb732f71
Content-Type: application/json

--- request body ---
{"handle":"qa-89608b2e175e","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-66a38245-9dd7-4997-a38f-c15fcb732f71
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cf35166a-44e0-4ba7-8687-84681c1c4ae6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9d41a335-4722-4767-8ef2-d83d8f1768c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d41a335-4722-4767-8ef2-d83d8f1768c9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-79e2accad4d4","subject":"Across regions","message":"Namaste"}

--- response: 201 in 116 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d41a335-4722-4767-8ef2-d83d8f1768c9
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
X-Served-Region: in
Location: /v1/conversations/cnv_00ed0e70-bb13-4a1b-a817-43f5a3d7f5ce
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_00ed0e70-bb13-4a1b-a817-43f5a3d7f5ce","subject":"Across regions","status":"open","region":"eu","participants":["qa-89608b2e175e","qa-79e2accad4d4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.804624081Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_00ed0e70-bb13-4a1b-a817-43f5a3d7f5ce
correlation: qa-17e9c17b-6c23-41ea-970d-9b03885d0001

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17e9c17b-6c23-41ea-970d-9b03885d0001
Content-Type: application/json

--- response: 200 in 51 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-17e9c17b-6c23-41ea-970d-9b03885d0001
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
X-Served-Region: in
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_00ed0e70-bb13-4a1b-a817-43f5a3d7f5ce","subject":"Across regions","status":"open","region":"eu","participants":["qa-89608b2e175e","qa-79e2accad4d4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.804624081Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7998d610-2efb-4f1a-b8c6-e6f61b35bf6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7998d610-2efb-4f1a-b8c6-e6f61b35bf6d
Content-Type: application/json

--- request body ---
{"handle":"qa-79e2accad4d4","password":"****"}

--- response: 200 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-7998d610-2efb-4f1a-b8c6-e6f61b35bf6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1f29657f-923a-4747-a2c8-043464892e19"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_00ed0e70-bb13-4a1b-a817-43f5a3d7f5ce
correlation: qa-a59dc3ba-7f7e-419c-9715-1916fdde8305

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a59dc3ba-7f7e-419c-9715-1916fdde8305
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a59dc3ba-7f7e-419c-9715-1916fdde8305
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_00ed0e70-bb13-4a1b-a817-43f5a3d7f5ce","subject":"Across regions","status":"open","region":"eu","participants":["qa-89608b2e175e","qa-79e2accad4d4"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-06T09:30:31.804624081Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fde845cf-ad4c-4c53-94aa-12e870f058d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fde845cf-ad4c-4c53-94aa-12e870f058d7
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fde845cf-ad4c-4c53-94aa-12e870f058d7
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
correlation: qa-fb337ae3-44a6-4fe4-98dd-e588b13ad5ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb337ae3-44a6-4fe4-98dd-e588b13ad5ff
Content-Type: application/json

--- request body ---
{"handle":"qa-79e2accad4d4","password":"****"}

--- response: 401 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb337ae3-44a6-4fe4-98dd-e588b13ad5ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fb337ae3-44a6-4fe4-98dd-e588b13ad5ff"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-410026ee-0bd5-4118-a7eb-9c16bbd4deaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-410026ee-0bd5-4118-a7eb-9c16bbd4deaa
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-410026ee-0bd5-4118-a7eb-9c16bbd4deaa
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
X-Served-Region: in
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-6aefc1b3-0c2e-42d3-b8cb-eade394109a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6aefc1b3-0c2e-42d3-b8cb-eade394109a1
Content-Type: application/json

--- request body ---
{"handle":"qa-89608b2e175e","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6aefc1b3-0c2e-42d3-b8cb-eade394109a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6aefc1b3-0c2e-42d3-b8cb-eade394109a1"}
```
