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
| 1 | `POST /v1/accounts` | 201 | 361 | `qa-91892e26-f9e3-4231-a9e5-52c1b8f14f3e` |
| 2 | `POST /v1/accounts` | 201 | 62 | `qa-3613b084-c02b-4ba6-9bc1-5938d301c8fd` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-a03e507c-3df4-4317-acc1-265470ba664b` |
| 4 | `POST /v1/conversations` | 201 | 40 | `qa-ad133cd0-5fcd-45b7-a458-6f56ed1385c0` |
| 5 | `GET /v1/conversations/{id}` | 200 | 45 | `qa-d3d08644-03f0-4376-95c3-8efc28f2938a` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-9d8f509c-0000-446e-8c85-61d6603d3219` |
| 7 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-0ec87cd7-c7f1-4d9f-bda3-22af88460385` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-3e47e0ee-648c-455f-b543-dbac3bb486ff` |
| 9 | `POST /v1/auth/token` | 401 | 26 | `qa-ec6e9be3-430d-4dd4-945c-a721c8878040` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-fd46be6b-4e86-4172-92ce-b89b1010bab4` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-2109369f-6038-4078-99fa-ad468d6efbb9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-91892e26-f9e3-4231-a9e5-52c1b8f14f3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91892e26-f9e3-4231-a9e5-52c1b8f14f3e
Content-Type: application/json

--- request body ---
{"handle":"qa-b3c5c433dee4","displayName":"QA b3c5c433dee4","password":"****","region":"in"}

--- response: 201 in 361 ms ---
Date: Wed, 11 Nov 2026 09:34:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-91892e26-f9e3-4231-a9e5-52c1b8f14f3e
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
Location: /v1/accounts/qa-b3c5c433dee4
X-Served-Region: in
Content-Length: 181

{"id":"acc_401e6faa-bd4b-4953-9fbe-193cf94e9184","handle":"qa-b3c5c433dee4","displayName":"QA b3c5c433dee4","region":"in","role":"user","createdAt":"2026-11-11T09:34:22.871692453Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3613b084-c02b-4ba6-9bc1-5938d301c8fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3613b084-c02b-4ba6-9bc1-5938d301c8fd
Content-Type: application/json

--- request body ---
{"handle":"qa-5f150e672ee4","displayName":"QA 5f150e672ee4","password":"****","region":"eu"}

--- response: 201 in 62 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-3613b084-c02b-4ba6-9bc1-5938d301c8fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-5f150e672ee4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f71568d5-b0d4-4e76-8e71-6681ef632b76","handle":"qa-5f150e672ee4","displayName":"QA 5f150e672ee4","region":"eu","role":"user","createdAt":"2026-11-11T09:34:23.212878612Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a03e507c-3df4-4317-acc1-265470ba664b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a03e507c-3df4-4317-acc1-265470ba664b
Content-Type: application/json

--- request body ---
{"handle":"qa-b3c5c433dee4","password":"****"}

--- response: 200 in 33 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-a03e507c-3df4-4317-acc1-265470ba664b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_401e6faa-bd4b-4953-9fbe-193cf94e9184"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ad133cd0-5fcd-45b7-a458-6f56ed1385c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad133cd0-5fcd-45b7-a458-6f56ed1385c0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5f150e672ee4","subject":"Across regions","message":"Namaste"}

--- response: 201 in 40 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad133cd0-5fcd-45b7-a458-6f56ed1385c0
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
Location: /v1/conversations/cnv_a915dd73-bff3-492f-a027-ef9ee887fa6a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a915dd73-bff3-492f-a027-ef9ee887fa6a","subject":"Across regions","status":"open","region":"eu","participants":["qa-b3c5c433dee4","qa-5f150e672ee4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:23.393309859Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_a915dd73-bff3-492f-a027-ef9ee887fa6a
correlation: qa-d3d08644-03f0-4376-95c3-8efc28f2938a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3d08644-03f0-4376-95c3-8efc28f2938a
Content-Type: application/json

--- response: 200 in 45 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3d08644-03f0-4376-95c3-8efc28f2938a
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

{"id":"cnv_a915dd73-bff3-492f-a027-ef9ee887fa6a","subject":"Across regions","status":"open","region":"eu","participants":["qa-b3c5c433dee4","qa-5f150e672ee4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:23.393309859Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9d8f509c-0000-446e-8c85-61d6603d3219

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d8f509c-0000-446e-8c85-61d6603d3219
Content-Type: application/json

--- request body ---
{"handle":"qa-5f150e672ee4","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d8f509c-0000-446e-8c85-61d6603d3219
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f71568d5-b0d4-4e76-8e71-6681ef632b76"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_a915dd73-bff3-492f-a027-ef9ee887fa6a
correlation: qa-0ec87cd7-c7f1-4d9f-bda3-22af88460385

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ec87cd7-c7f1-4d9f-bda3-22af88460385
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ec87cd7-c7f1-4d9f-bda3-22af88460385
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

{"id":"cnv_a915dd73-bff3-492f-a027-ef9ee887fa6a","subject":"Across regions","status":"open","region":"eu","participants":["qa-b3c5c433dee4","qa-5f150e672ee4"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-11T09:34:23.393309859Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3e47e0ee-648c-455f-b543-dbac3bb486ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e47e0ee-648c-455f-b543-dbac3bb486ff
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3e47e0ee-648c-455f-b543-dbac3bb486ff
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
correlation: qa-ec6e9be3-430d-4dd4-945c-a721c8878040

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec6e9be3-430d-4dd4-945c-a721c8878040
Content-Type: application/json

--- request body ---
{"handle":"qa-5f150e672ee4","password":"****"}

--- response: 401 in 26 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec6e9be3-430d-4dd4-945c-a721c8878040
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ec6e9be3-430d-4dd4-945c-a721c8878040"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd46be6b-4e86-4172-92ce-b89b1010bab4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd46be6b-4e86-4172-92ce-b89b1010bab4
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd46be6b-4e86-4172-92ce-b89b1010bab4
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
correlation: qa-2109369f-6038-4078-99fa-ad468d6efbb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2109369f-6038-4078-99fa-ad468d6efbb9
Content-Type: application/json

--- request body ---
{"handle":"qa-b3c5c433dee4","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2109369f-6038-4078-99fa-ad468d6efbb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2109369f-6038-4078-99fa-ad468d6efbb9"}
```
