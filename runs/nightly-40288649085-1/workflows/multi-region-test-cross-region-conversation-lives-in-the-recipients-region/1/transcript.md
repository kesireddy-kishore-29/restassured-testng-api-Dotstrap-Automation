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
| 1 | `POST /v1/accounts` | 201 | 462 | `qa-b9d93828-f8ad-4b24-9231-45172c2b642c` |
| 2 | `POST /v1/accounts` | 201 | 87 | `qa-1028dfce-03a8-4925-8ca8-2517575e376b` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-44017e5d-6495-4d22-99a6-ee1446916cc3` |
| 4 | `POST /v1/conversations` | 201 | 32 | `qa-dfa18b48-37f5-4b77-a70c-f8dbeaa63742` |
| 5 | `GET /v1/conversations/{id}` | 200 | 35 | `qa-fa63f85d-b1af-4460-afcb-fb024036107a` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-e9978699-7961-4f6d-a55b-7b841e009a71` |
| 7 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-9f3a3bc4-b96f-4cad-a81b-99ddf85d8f96` |
| 8 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-37049d0c-9bca-4ba9-8c58-30ca1181dff3` |
| 9 | `POST /v1/auth/token` | 401 | 25 | `qa-9098717f-70f1-4f7e-9087-6510d56cbcc4` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-9d350a51-9de8-4396-8ea1-862cbbb4b69d` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-ebb240cb-ca84-46d6-b7c8-fc6a831790fc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b9d93828-f8ad-4b24-9231-45172c2b642c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9d93828-f8ad-4b24-9231-45172c2b642c
Content-Type: application/json

--- request body ---
{"handle":"qa-6b292f49c0eb","displayName":"QA 6b292f49c0eb","password":"****","region":"in"}

--- response: 201 in 462 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9d93828-f8ad-4b24-9231-45172c2b642c
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
Location: /v1/accounts/qa-6b292f49c0eb
X-Served-Region: in
Content-Length: 181

{"id":"acc_964d86ca-ab81-4494-887e-a1bbfcb41cdd","handle":"qa-6b292f49c0eb","displayName":"QA 6b292f49c0eb","region":"in","role":"user","createdAt":"2026-10-26T07:54:47.458173550Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1028dfce-03a8-4925-8ca8-2517575e376b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1028dfce-03a8-4925-8ca8-2517575e376b
Content-Type: application/json

--- request body ---
{"handle":"qa-1ee2f2593d6c","displayName":"QA 1ee2f2593d6c","password":"****","region":"eu"}

--- response: 201 in 87 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-1028dfce-03a8-4925-8ca8-2517575e376b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-1ee2f2593d6c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_adf5c9fe-355a-4111-8fdf-82147e9689f7","handle":"qa-1ee2f2593d6c","displayName":"QA 1ee2f2593d6c","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.887614683Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-44017e5d-6495-4d22-99a6-ee1446916cc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44017e5d-6495-4d22-99a6-ee1446916cc3
Content-Type: application/json

--- request body ---
{"handle":"qa-6b292f49c0eb","password":"****"}

--- response: 200 in 47 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-44017e5d-6495-4d22-99a6-ee1446916cc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_964d86ca-ab81-4494-887e-a1bbfcb41cdd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-dfa18b48-37f5-4b77-a70c-f8dbeaa63742

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfa18b48-37f5-4b77-a70c-f8dbeaa63742
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1ee2f2593d6c","subject":"Across regions","message":"Namaste"}

--- response: 201 in 32 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfa18b48-37f5-4b77-a70c-f8dbeaa63742
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
Location: /v1/conversations/cnv_2450b21f-c5bb-47bd-858e-4da5334476db
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2450b21f-c5bb-47bd-858e-4da5334476db","subject":"Across regions","status":"open","region":"eu","participants":["qa-6b292f49c0eb","qa-1ee2f2593d6c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.088078719Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_2450b21f-c5bb-47bd-858e-4da5334476db
correlation: qa-fa63f85d-b1af-4460-afcb-fb024036107a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa63f85d-b1af-4460-afcb-fb024036107a
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa63f85d-b1af-4460-afcb-fb024036107a
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

{"id":"cnv_2450b21f-c5bb-47bd-858e-4da5334476db","subject":"Across regions","status":"open","region":"eu","participants":["qa-6b292f49c0eb","qa-1ee2f2593d6c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.088078719Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e9978699-7961-4f6d-a55b-7b841e009a71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9978699-7961-4f6d-a55b-7b841e009a71
Content-Type: application/json

--- request body ---
{"handle":"qa-1ee2f2593d6c","password":"****"}

--- response: 200 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9978699-7961-4f6d-a55b-7b841e009a71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_adf5c9fe-355a-4111-8fdf-82147e9689f7"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_2450b21f-c5bb-47bd-858e-4da5334476db
correlation: qa-9f3a3bc4-b96f-4cad-a81b-99ddf85d8f96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f3a3bc4-b96f-4cad-a81b-99ddf85d8f96
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f3a3bc4-b96f-4cad-a81b-99ddf85d8f96
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

{"id":"cnv_2450b21f-c5bb-47bd-858e-4da5334476db","subject":"Across regions","status":"open","region":"eu","participants":["qa-6b292f49c0eb","qa-1ee2f2593d6c"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-26T07:54:48.088078719Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-37049d0c-9bca-4ba9-8c58-30ca1181dff3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37049d0c-9bca-4ba9-8c58-30ca1181dff3
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-37049d0c-9bca-4ba9-8c58-30ca1181dff3
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
correlation: qa-9098717f-70f1-4f7e-9087-6510d56cbcc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9098717f-70f1-4f7e-9087-6510d56cbcc4
Content-Type: application/json

--- request body ---
{"handle":"qa-1ee2f2593d6c","password":"****"}

--- response: 401 in 25 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9098717f-70f1-4f7e-9087-6510d56cbcc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9098717f-70f1-4f7e-9087-6510d56cbcc4"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9d350a51-9de8-4396-8ea1-862cbbb4b69d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d350a51-9de8-4396-8ea1-862cbbb4b69d
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9d350a51-9de8-4396-8ea1-862cbbb4b69d
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
correlation: qa-ebb240cb-ca84-46d6-b7c8-fc6a831790fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebb240cb-ca84-46d6-b7c8-fc6a831790fc
Content-Type: application/json

--- request body ---
{"handle":"qa-6b292f49c0eb","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ebb240cb-ca84-46d6-b7c8-fc6a831790fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ebb240cb-ca84-46d6-b7c8-fc6a831790fc"}
```
