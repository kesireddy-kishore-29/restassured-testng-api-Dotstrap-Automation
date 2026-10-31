# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 83 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 379 | `qa-29cb5caf-59c2-477b-b1fc-7b206fb2b649` |
| 2 | `POST /v1/auth/token` | 200 | 54 | `qa-27acadbb-c1e4-41ee-b1ee-ecc0cf5411f5` |
| 3 | `GET /v1/accounts/me` | 200 | 43 | `qa-1eaa3bae-8b80-4002-a135-1e75dbce61c3` |
| 4 | `GET /v1/accounts/me` | 200 | 22 | `qa-a746d1aa-2106-47fa-aeb1-a9497ba149a0` |
| 5 | `GET /v1/accounts/me` | 200 | 12 | `qa-b3ca907c-cb1e-4315-ab24-6e6f34715db1` |
| 6 | `GET /v1/accounts/me` | 200 | 19 | `qa-a84a0e01-8f46-479b-ba99-9d130f5639d5` |
| 7 | `GET /v1/accounts/me` | 200 | 17 | `qa-b5035869-efc3-402c-b838-1824ea3e22d8` |
| 8 | `GET /v1/accounts/me` | 200 | 14 | `qa-68f6f884-5fea-41c4-865a-223e200ef46b` |
| 9 | `GET /v1/accounts/me` | 200 | 13 | `qa-4ad5aabe-6926-4a20-ab74-a02539a7993f` |
| 10 | `GET /v1/accounts/me` | 200 | 12 | `qa-bae4efc1-1890-446d-9f72-bd76acdb414c` |
| 11 | `GET /v1/accounts/me` | 200 | 9 | `qa-2fe00bbd-50f3-48dd-9f47-37038b754a94` |
| 12 | `GET /v1/accounts/me` | 200 | 8 | `qa-57042caf-1308-437a-948e-b5d860c2b53f` |
| 13 | `GET /v1/accounts/me` | 200 | 8 | `qa-a535423e-77c2-463b-be9d-ecc4049efdbe` |
| 14 | `GET /v1/accounts/me` | 200 | 8 | `qa-c4c2ecec-35c7-4b4d-a356-4759013b7644` |
| 15 | `GET /v1/accounts/me` | 200 | 7 | `qa-eab05ef3-5852-4e18-9fc9-99d6a1d610a2` |
| 16 | `GET /v1/accounts/me` | 200 | 8 | `qa-507cd78f-c5a1-4f33-bf6e-8c087b6319c9` |
| 17 | `GET /v1/accounts/me` | 200 | 8 | `qa-e79dc0d3-657f-4d96-8e4b-f10cb8efd076` |
| 18 | `GET /v1/accounts/me` | 200 | 8 | `qa-61220894-3b08-42ec-ad77-8308c99d02c0` |
| 19 | `GET /v1/accounts/me` | 200 | 10 | `qa-1f387f34-c0d3-4196-85d8-79699f344031` |
| 20 | `GET /v1/accounts/me` | 200 | 8 | `qa-b0a924d2-1cd8-4c24-a4c7-b218840ac079` |
| 21 | `GET /v1/accounts/me` | 200 | 22 | `qa-8c464143-f7e9-4a39-90c4-62923bd5029d` |
| 22 | `GET /v1/accounts/me` | 200 | 10 | `qa-f0a60e1d-1809-4da6-aebc-ddc206283734` |
| 23 | `GET /v1/accounts/me` | 200 | 15 | `qa-8d8b4969-0401-4d31-bf03-47827181963a` |
| 24 | `GET /v1/accounts/me` | 200 | 11 | `qa-0d870281-89dc-489e-9aba-624ef50a2f4e` |
| 25 | `GET /v1/accounts/me` | 200 | 13 | `qa-1b7f2d35-b92d-4a14-9241-48ea62a82e5b` |
| 26 | `GET /v1/accounts/me` | 200 | 15 | `qa-93f03b2c-93ef-472c-adc3-e22fc2fcf0d7` |
| 27 | `GET /v1/accounts/me` | 200 | 32 | `qa-288f009e-1d71-4c54-9599-9cb1d6aa1c0e` |
| 28 | `GET /v1/accounts/me` | 200 | 17 | `qa-1ff0bbed-9af3-400e-9e91-b582221090d0` |
| 29 | `GET /v1/accounts/me` | 200 | 14 | `qa-a7c7161a-704b-4cc0-b7ec-80293be1d8f9` |
| 30 | `GET /v1/accounts/me` | 200 | 6 | `qa-a082c956-ae0c-4635-9982-596c1f04ab6c` |
| 31 | `GET /v1/accounts/me` | 200 | 9 | `qa-54de07ef-5b81-4687-a6c2-2abb21296918` |
| 32 | `GET /v1/accounts/me` | 200 | 7 | `qa-222cbb59-1548-4abf-93b3-7ecc9892ea7d` |
| 33 | `GET /v1/accounts/me` | 200 | 13 | `qa-04dd0f1c-eb72-4077-9fcb-36c56b72829a` |
| 34 | `GET /v1/accounts/me` | 200 | 15 | `qa-60a09898-863d-48f4-944e-968542fb7f92` |
| 35 | `GET /v1/accounts/me` | 200 | 12 | `qa-3467ec21-362b-432b-b3c0-6dbff4d7ed4a` |
| 36 | `GET /v1/accounts/me` | 200 | 7 | `qa-e78dd9a0-5d04-405c-9ba5-a489c9d062c9` |
| 37 | `GET /v1/accounts/me` | 200 | 5 | `qa-a4488701-d687-4c8c-8425-da0fc4f3c4ff` |
| 38 | `GET /v1/accounts/me` | 200 | 5 | `qa-132cf87d-3be8-4d8b-8949-c2da3b357733` |
| 39 | `GET /v1/accounts/me` | 200 | 7 | `qa-67c64a56-0fab-4a97-8d5d-d2944a69f1ab` |
| 40 | `GET /v1/accounts/me` | 200 | 8 | `qa-6e5f35c8-7cb3-4675-b1b2-84400b6dea10` |
| 41 | `GET /v1/accounts/me` | 200 | 7 | `qa-d4dde13a-9521-4a98-abbd-0f4ba3e79559` |
| 42 | `GET /v1/accounts/me` | 200 | 6 | `qa-4fc2e4be-7ad1-4b90-ab08-24ebbecca388` |
| 43 | `GET /v1/accounts/me` | 200 | 20 | `qa-2ec15d25-a22f-4549-94c7-87e9091fe165` |
| 44 | `GET /v1/accounts/me` | 200 | 8 | `qa-470d5115-1ed0-4676-b704-78b8863ca0a4` |
| 45 | `GET /v1/accounts/me` | 200 | 10 | `qa-b1573369-ef4f-4077-8d74-7d4c9257c366` |
| 46 | `GET /v1/accounts/me` | 200 | 11 | `qa-69b74958-6b07-46bc-9564-ae1507d3b87d` |
| 47 | `GET /v1/accounts/me` | 200 | 10 | `qa-593e3de9-b85e-4a38-8f15-8902051f1abb` |
| 48 | `GET /v1/accounts/me` | 200 | 5 | `qa-d67f010e-e37a-4459-9461-95aa2c32d3a4` |
| 49 | `GET /v1/accounts/me` | 200 | 5 | `qa-f0ef0dd9-6db8-488c-9624-f7ae5138e6bb` |
| 50 | `GET /v1/accounts/me` | 200 | 5 | `qa-bd4d290d-a470-424a-b326-5bfbb652d9a4` |
| 51 | `GET /v1/accounts/me` | 200 | 6 | `qa-a7421c35-cdb2-442b-9e69-301a18717126` |
| 52 | `GET /v1/accounts/me` | 200 | 6 | `qa-9b453466-0122-49fa-b318-fd15965a875d` |
| 53 | `GET /v1/accounts/me` | 200 | 10 | `qa-f1033a8d-8237-4df5-91ec-71e7b5681195` |
| 54 | `GET /v1/accounts/me` | 200 | 13 | `qa-939e4afe-2053-4a07-9434-a58bfa9ed434` |
| 55 | `GET /v1/accounts/me` | 200 | 7 | `qa-a79f2350-6df2-42ff-a079-a4febff8cf9c` |
| 56 | `GET /v1/accounts/me` | 200 | 10 | `qa-6cf9fa66-1534-497b-aa34-6f5dd8d1e2b2` |
| 57 | `GET /v1/accounts/me` | 200 | 4 | `qa-e9dd20fc-7fe9-4fca-8353-fd18cb09384c` |
| 58 | `GET /v1/accounts/me` | 200 | 6 | `qa-403851ca-fb5c-4dc0-ae15-e23f0bebacdb` |
| 59 | `GET /v1/accounts/me` | 200 | 5 | `qa-aa7be0f1-3dfb-4cf5-85db-4822ee9e8a84` |
| 60 | `GET /v1/accounts/me` | 200 | 6 | `qa-fe45106c-d972-4aee-9195-76a7da39eece` |
| 61 | `GET /v1/accounts/me` | 200 | 5 | `qa-9192b76d-0d75-4802-96a4-ecbd5297d9d0` |
| 62 | `GET /v1/accounts/me` | 200 | 5 | `qa-a35a43ba-823b-478c-94d2-ba1d495189ad` |
| 63 | `GET /v1/accounts/me` | 429 | 5 | `qa-8ed5db8d-eeca-4ed4-b2ae-d48e9b6a398c` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-1e49159b-7b23-4bdb-b2b1-70f9aef52074` |
| 65 | `GET /v1/accounts/me` | 429 | 5 | `qa-81593898-5e5d-4472-8a50-cdf309527d8f` |
| 66 | `GET /v1/accounts/me` | 429 | 4 | `qa-909d801f-8af8-4986-8841-9b575ca342c5` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-5457d849-5856-4e53-853d-f861adf47544` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-7bf29011-1032-420b-bbdb-2513c6282610` |
| 69 | `GET /v1/accounts/me` | 429 | 5 | `qa-33c291ac-56a2-47d5-a746-e4a9db7fbee0` |
| 70 | `GET /v1/accounts/me` | 429 | 6 | `qa-a2aa3bf8-9e0c-4b67-8c96-84957ee2bdb1` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-3b0e56b9-2b50-4272-b802-b47152350c70` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-e97c9167-8e81-4903-b75b-5b78a2c0986b` |
| 73 | `GET /v1/accounts/me` | 429 | 5 | `qa-4217f634-eb48-4ccc-9d6f-c0edea30cc6d` |
| 74 | `GET /v1/accounts/me` | 429 | 6 | `qa-5c839316-6bf0-4ab1-a73e-12906a87ea2e` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-3d3621b0-7e80-4f1c-8623-a2805d842a03` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-7718b322-9e07-4853-9e70-708b5ccf770a` |
| 77 | `GET /v1/accounts/me` | 429 | 5 | `qa-c8690580-32ba-4ec6-ac79-922c8362cb0b` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-3a6eb1c0-c542-4004-9ee1-172b455ee6bd` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-765e52b3-9bc4-4f3e-bf9a-397a12b263c1` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-c52326d7-bb2e-4da8-89e6-674cb9d69aef` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-8109f7dc-6c87-4760-a48a-e417812f9ddf` |
| 82 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-56a54efe-d362-4947-81ca-dc433e7a6120` |
| 83 | `POST /v1/auth/token` | 401 | 3 | `qa-02edf7f1-c9aa-4ea4-8ee6-fe1cc1b99799` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-29cb5caf-59c2-477b-b1fc-7b206fb2b649

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29cb5caf-59c2-477b-b1fc-7b206fb2b649
Content-Type: application/json

--- request body ---
{"handle":"qa-a90da023e722","displayName":"QA a90da023e722","password":"****","region":"eu"}

--- response: 201 in 379 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-29cb5caf-59c2-477b-b1fc-7b206fb2b649
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
Location: /v1/accounts/qa-a90da023e722
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-27acadbb-c1e4-41ee-b1ee-ecc0cf5411f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27acadbb-c1e4-41ee-b1ee-ecc0cf5411f5
Content-Type: application/json

--- request body ---
{"handle":"qa-a90da023e722","password":"****"}

--- response: 200 in 54 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-27acadbb-c1e4-41ee-b1ee-ecc0cf5411f5
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-1eaa3bae-8b80-4002-a135-1e75dbce61c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1eaa3bae-8b80-4002-a135-1e75dbce61c3
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-1eaa3bae-8b80-4002-a135-1e75dbce61c3
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

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-a746d1aa-2106-47fa-aeb1-a9497ba149a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a746d1aa-2106-47fa-aeb1-a9497ba149a0
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a746d1aa-2106-47fa-aeb1-a9497ba149a0
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
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-b3ca907c-cb1e-4315-ab24-6e6f34715db1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3ca907c-cb1e-4315-ab24-6e6f34715db1
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3ca907c-cb1e-4315-ab24-6e6f34715db1
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
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-a84a0e01-8f46-479b-ba99-9d130f5639d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a84a0e01-8f46-479b-ba99-9d130f5639d5
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a84a0e01-8f46-479b-ba99-9d130f5639d5
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
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5035869-efc3-402c-b838-1824ea3e22d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5035869-efc3-402c-b838-1824ea3e22d8
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5035869-efc3-402c-b838-1824ea3e22d8
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
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-68f6f884-5fea-41c4-865a-223e200ef46b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68f6f884-5fea-41c4-865a-223e200ef46b
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-68f6f884-5fea-41c4-865a-223e200ef46b
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
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-4ad5aabe-6926-4a20-ab74-a02539a7993f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ad5aabe-6926-4a20-ab74-a02539a7993f
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ad5aabe-6926-4a20-ab74-a02539a7993f
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
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-bae4efc1-1890-446d-9f72-bd76acdb414c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bae4efc1-1890-446d-9f72-bd76acdb414c
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-bae4efc1-1890-446d-9f72-bd76acdb414c
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
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-2fe00bbd-50f3-48dd-9f47-37038b754a94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fe00bbd-50f3-48dd-9f47-37038b754a94
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fe00bbd-50f3-48dd-9f47-37038b754a94
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
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-57042caf-1308-437a-948e-b5d860c2b53f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57042caf-1308-437a-948e-b5d860c2b53f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-57042caf-1308-437a-948e-b5d860c2b53f
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
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-a535423e-77c2-463b-be9d-ecc4049efdbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a535423e-77c2-463b-be9d-ecc4049efdbe
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a535423e-77c2-463b-be9d-ecc4049efdbe
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
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-c4c2ecec-35c7-4b4d-a356-4759013b7644

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4c2ecec-35c7-4b4d-a356-4759013b7644
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4c2ecec-35c7-4b4d-a356-4759013b7644
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
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-eab05ef3-5852-4e18-9fc9-99d6a1d610a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eab05ef3-5852-4e18-9fc9-99d6a1d610a2
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-eab05ef3-5852-4e18-9fc9-99d6a1d610a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-507cd78f-c5a1-4f33-bf6e-8c087b6319c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-507cd78f-c5a1-4f33-bf6e-8c087b6319c9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-507cd78f-c5a1-4f33-bf6e-8c087b6319c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-e79dc0d3-657f-4d96-8e4b-f10cb8efd076

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e79dc0d3-657f-4d96-8e4b-f10cb8efd076
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e79dc0d3-657f-4d96-8e4b-f10cb8efd076
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-61220894-3b08-42ec-ad77-8308c99d02c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61220894-3b08-42ec-ad77-8308c99d02c0
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-61220894-3b08-42ec-ad77-8308c99d02c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f387f34-c0d3-4196-85d8-79699f344031

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f387f34-c0d3-4196-85d8-79699f344031
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f387f34-c0d3-4196-85d8-79699f344031
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0a924d2-1cd8-4c24-a4c7-b218840ac079

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0a924d2-1cd8-4c24-a4c7-b218840ac079
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0a924d2-1cd8-4c24-a4c7-b218840ac079
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c464143-f7e9-4a39-90c4-62923bd5029d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c464143-f7e9-4a39-90c4-62923bd5029d
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c464143-f7e9-4a39-90c4-62923bd5029d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-f0a60e1d-1809-4da6-aebc-ddc206283734

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0a60e1d-1809-4da6-aebc-ddc206283734
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0a60e1d-1809-4da6-aebc-ddc206283734
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-8d8b4969-0401-4d31-bf03-47827181963a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d8b4969-0401-4d31-bf03-47827181963a
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d8b4969-0401-4d31-bf03-47827181963a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d870281-89dc-489e-9aba-624ef50a2f4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d870281-89dc-489e-9aba-624ef50a2f4e
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d870281-89dc-489e-9aba-624ef50a2f4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-1b7f2d35-b92d-4a14-9241-48ea62a82e5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b7f2d35-b92d-4a14-9241-48ea62a82e5b
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b7f2d35-b92d-4a14-9241-48ea62a82e5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-93f03b2c-93ef-472c-adc3-e22fc2fcf0d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93f03b2c-93ef-472c-adc3-e22fc2fcf0d7
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-93f03b2c-93ef-472c-adc3-e22fc2fcf0d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-288f009e-1d71-4c54-9599-9cb1d6aa1c0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-288f009e-1d71-4c54-9599-9cb1d6aa1c0e
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-288f009e-1d71-4c54-9599-9cb1d6aa1c0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-1ff0bbed-9af3-400e-9e91-b582221090d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ff0bbed-9af3-400e-9e91-b582221090d0
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ff0bbed-9af3-400e-9e91-b582221090d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7c7161a-704b-4cc0-b7ec-80293be1d8f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7c7161a-704b-4cc0-b7ec-80293be1d8f9
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7c7161a-704b-4cc0-b7ec-80293be1d8f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-a082c956-ae0c-4635-9982-596c1f04ab6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a082c956-ae0c-4635-9982-596c1f04ab6c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a082c956-ae0c-4635-9982-596c1f04ab6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-54de07ef-5b81-4687-a6c2-2abb21296918

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54de07ef-5b81-4687-a6c2-2abb21296918
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-54de07ef-5b81-4687-a6c2-2abb21296918
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-222cbb59-1548-4abf-93b3-7ecc9892ea7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-222cbb59-1548-4abf-93b3-7ecc9892ea7d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-222cbb59-1548-4abf-93b3-7ecc9892ea7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-04dd0f1c-eb72-4077-9fcb-36c56b72829a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04dd0f1c-eb72-4077-9fcb-36c56b72829a
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-04dd0f1c-eb72-4077-9fcb-36c56b72829a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-60a09898-863d-48f4-944e-968542fb7f92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60a09898-863d-48f4-944e-968542fb7f92
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-60a09898-863d-48f4-944e-968542fb7f92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-3467ec21-362b-432b-b3c0-6dbff4d7ed4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3467ec21-362b-432b-b3c0-6dbff4d7ed4a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-3467ec21-362b-432b-b3c0-6dbff4d7ed4a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-e78dd9a0-5d04-405c-9ba5-a489c9d062c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e78dd9a0-5d04-405c-9ba5-a489c9d062c9
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e78dd9a0-5d04-405c-9ba5-a489c9d062c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-a4488701-d687-4c8c-8425-da0fc4f3c4ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4488701-d687-4c8c-8425-da0fc4f3c4ff
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4488701-d687-4c8c-8425-da0fc4f3c4ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-132cf87d-3be8-4d8b-8949-c2da3b357733

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-132cf87d-3be8-4d8b-8949-c2da3b357733
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-132cf87d-3be8-4d8b-8949-c2da3b357733
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-67c64a56-0fab-4a97-8d5d-d2944a69f1ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67c64a56-0fab-4a97-8d5d-d2944a69f1ab
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-67c64a56-0fab-4a97-8d5d-d2944a69f1ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-6e5f35c8-7cb3-4675-b1b2-84400b6dea10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e5f35c8-7cb3-4675-b1b2-84400b6dea10
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e5f35c8-7cb3-4675-b1b2-84400b6dea10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-d4dde13a-9521-4a98-abbd-0f4ba3e79559

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4dde13a-9521-4a98-abbd-0f4ba3e79559
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4dde13a-9521-4a98-abbd-0f4ba3e79559
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-4fc2e4be-7ad1-4b90-ab08-24ebbecca388

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fc2e4be-7ad1-4b90-ab08-24ebbecca388
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fc2e4be-7ad1-4b90-ab08-24ebbecca388
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-2ec15d25-a22f-4549-94c7-87e9091fe165

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ec15d25-a22f-4549-94c7-87e9091fe165
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ec15d25-a22f-4549-94c7-87e9091fe165
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-470d5115-1ed0-4676-b704-78b8863ca0a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-470d5115-1ed0-4676-b704-78b8863ca0a4
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-470d5115-1ed0-4676-b704-78b8863ca0a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-b1573369-ef4f-4077-8d74-7d4c9257c366

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1573369-ef4f-4077-8d74-7d4c9257c366
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1573369-ef4f-4077-8d74-7d4c9257c366
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-69b74958-6b07-46bc-9564-ae1507d3b87d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69b74958-6b07-46bc-9564-ae1507d3b87d
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-69b74958-6b07-46bc-9564-ae1507d3b87d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-593e3de9-b85e-4a38-8f15-8902051f1abb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-593e3de9-b85e-4a38-8f15-8902051f1abb
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-593e3de9-b85e-4a38-8f15-8902051f1abb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-d67f010e-e37a-4459-9461-95aa2c32d3a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d67f010e-e37a-4459-9461-95aa2c32d3a4
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d67f010e-e37a-4459-9461-95aa2c32d3a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-f0ef0dd9-6db8-488c-9624-f7ae5138e6bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0ef0dd9-6db8-488c-9624-f7ae5138e6bb
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0ef0dd9-6db8-488c-9624-f7ae5138e6bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd4d290d-a470-424a-b326-5bfbb652d9a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd4d290d-a470-424a-b326-5bfbb652d9a4
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd4d290d-a470-424a-b326-5bfbb652d9a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7421c35-cdb2-442b-9e69-301a18717126

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7421c35-cdb2-442b-9e69-301a18717126
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7421c35-cdb2-442b-9e69-301a18717126
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b453466-0122-49fa-b318-fd15965a875d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b453466-0122-49fa-b318-fd15965a875d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b453466-0122-49fa-b318-fd15965a875d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-f1033a8d-8237-4df5-91ec-71e7b5681195

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1033a8d-8237-4df5-91ec-71e7b5681195
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1033a8d-8237-4df5-91ec-71e7b5681195
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-939e4afe-2053-4a07-9434-a58bfa9ed434

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-939e4afe-2053-4a07-9434-a58bfa9ed434
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-939e4afe-2053-4a07-9434-a58bfa9ed434
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-a79f2350-6df2-42ff-a079-a4febff8cf9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a79f2350-6df2-42ff-a079-a4febff8cf9c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a79f2350-6df2-42ff-a079-a4febff8cf9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-6cf9fa66-1534-497b-aa34-6f5dd8d1e2b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cf9fa66-1534-497b-aa34-6f5dd8d1e2b2
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cf9fa66-1534-497b-aa34-6f5dd8d1e2b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-e9dd20fc-7fe9-4fca-8353-fd18cb09384c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9dd20fc-7fe9-4fca-8353-fd18cb09384c
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9dd20fc-7fe9-4fca-8353-fd18cb09384c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-403851ca-fb5c-4dc0-ae15-e23f0bebacdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-403851ca-fb5c-4dc0-ae15-e23f0bebacdb
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-403851ca-fb5c-4dc0-ae15-e23f0bebacdb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-aa7be0f1-3dfb-4cf5-85db-4822ee9e8a84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa7be0f1-3dfb-4cf5-85db-4822ee9e8a84
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa7be0f1-3dfb-4cf5-85db-4822ee9e8a84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-fe45106c-d972-4aee-9195-76a7da39eece

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe45106c-d972-4aee-9195-76a7da39eece
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe45106c-d972-4aee-9195-76a7da39eece
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-9192b76d-0d75-4802-96a4-ecbd5297d9d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9192b76d-0d75-4802-96a4-ecbd5297d9d0
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9192b76d-0d75-4802-96a4-ecbd5297d9d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-a35a43ba-823b-478c-94d2-ba1d495189ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a35a43ba-823b-478c-94d2-ba1d495189ad
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a35a43ba-823b-478c-94d2-ba1d495189ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ed5db8d-eeca-4ed4-b2ae-d48e9b6a398c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ed5db8d-eeca-4ed4-b2ae-d48e9b6a398c
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ed5db8d-eeca-4ed4-b2ae-d48e9b6a398c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8ed5db8d-eeca-4ed4-b2ae-d48e9b6a398c"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e49159b-7b23-4bdb-b2b1-70f9aef52074

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e49159b-7b23-4bdb-b2b1-70f9aef52074
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e49159b-7b23-4bdb-b2b1-70f9aef52074
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1e49159b-7b23-4bdb-b2b1-70f9aef52074"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-81593898-5e5d-4472-8a50-cdf309527d8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81593898-5e5d-4472-8a50-cdf309527d8f
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81593898-5e5d-4472-8a50-cdf309527d8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-81593898-5e5d-4472-8a50-cdf309527d8f"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-909d801f-8af8-4986-8841-9b575ca342c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-909d801f-8af8-4986-8841-9b575ca342c5
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-909d801f-8af8-4986-8841-9b575ca342c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-909d801f-8af8-4986-8841-9b575ca342c5"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-5457d849-5856-4e53-853d-f861adf47544

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5457d849-5856-4e53-853d-f861adf47544
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5457d849-5856-4e53-853d-f861adf47544
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5457d849-5856-4e53-853d-f861adf47544"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-7bf29011-1032-420b-bbdb-2513c6282610

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bf29011-1032-420b-bbdb-2513c6282610
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7bf29011-1032-420b-bbdb-2513c6282610
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7bf29011-1032-420b-bbdb-2513c6282610"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-33c291ac-56a2-47d5-a746-e4a9db7fbee0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33c291ac-56a2-47d5-a746-e4a9db7fbee0
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33c291ac-56a2-47d5-a746-e4a9db7fbee0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-33c291ac-56a2-47d5-a746-e4a9db7fbee0"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-a2aa3bf8-9e0c-4b67-8c96-84957ee2bdb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2aa3bf8-9e0c-4b67-8c96-84957ee2bdb1
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a2aa3bf8-9e0c-4b67-8c96-84957ee2bdb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a2aa3bf8-9e0c-4b67-8c96-84957ee2bdb1"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-3b0e56b9-2b50-4272-b802-b47152350c70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b0e56b9-2b50-4272-b802-b47152350c70
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b0e56b9-2b50-4272-b802-b47152350c70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3b0e56b9-2b50-4272-b802-b47152350c70"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-e97c9167-8e81-4903-b75b-5b78a2c0986b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e97c9167-8e81-4903-b75b-5b78a2c0986b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e97c9167-8e81-4903-b75b-5b78a2c0986b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e97c9167-8e81-4903-b75b-5b78a2c0986b"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-4217f634-eb48-4ccc-9d6f-c0edea30cc6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4217f634-eb48-4ccc-9d6f-c0edea30cc6d
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4217f634-eb48-4ccc-9d6f-c0edea30cc6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4217f634-eb48-4ccc-9d6f-c0edea30cc6d"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-5c839316-6bf0-4ab1-a73e-12906a87ea2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c839316-6bf0-4ab1-a73e-12906a87ea2e
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c839316-6bf0-4ab1-a73e-12906a87ea2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5c839316-6bf0-4ab1-a73e-12906a87ea2e"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d3621b0-7e80-4f1c-8623-a2805d842a03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d3621b0-7e80-4f1c-8623-a2805d842a03
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d3621b0-7e80-4f1c-8623-a2805d842a03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3d3621b0-7e80-4f1c-8623-a2805d842a03"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-7718b322-9e07-4853-9e70-708b5ccf770a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7718b322-9e07-4853-9e70-708b5ccf770a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7718b322-9e07-4853-9e70-708b5ccf770a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7718b322-9e07-4853-9e70-708b5ccf770a"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-c8690580-32ba-4ec6-ac79-922c8362cb0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8690580-32ba-4ec6-ac79-922c8362cb0b
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8690580-32ba-4ec6-ac79-922c8362cb0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c8690580-32ba-4ec6-ac79-922c8362cb0b"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-3a6eb1c0-c542-4004-9ee1-172b455ee6bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a6eb1c0-c542-4004-9ee1-172b455ee6bd
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a6eb1c0-c542-4004-9ee1-172b455ee6bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3a6eb1c0-c542-4004-9ee1-172b455ee6bd"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-765e52b3-9bc4-4f3e-bf9a-397a12b263c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-765e52b3-9bc4-4f3e-bf9a-397a12b263c1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-765e52b3-9bc4-4f3e-bf9a-397a12b263c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-765e52b3-9bc4-4f3e-bf9a-397a12b263c1"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-c52326d7-bb2e-4da8-89e6-674cb9d69aef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c52326d7-bb2e-4da8-89e6-674cb9d69aef
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c52326d7-bb2e-4da8-89e6-674cb9d69aef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c52326d7-bb2e-4da8-89e6-674cb9d69aef"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-8109f7dc-6c87-4760-a48a-e417812f9ddf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8109f7dc-6c87-4760-a48a-e417812f9ddf
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-8109f7dc-6c87-4760-a48a-e417812f9ddf
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

{"id":"acc_5d178ee3-b0f2-4e50-893c-6a756d306f57","handle":"qa-a90da023e722","displayName":"QA a90da023e722","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.858018157Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-56a54efe-d362-4947-81ca-dc433e7a6120

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56a54efe-d362-4947-81ca-dc433e7a6120
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-56a54efe-d362-4947-81ca-dc433e7a6120
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

## 83. POST /v1/auth/token

```text
#83 POST http://localhost:7070/v1/auth/token
correlation: qa-02edf7f1-c9aa-4ea4-8ee6-fe1cc1b99799

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02edf7f1-c9aa-4ea4-8ee6-fe1cc1b99799
Content-Type: application/json

--- request body ---
{"handle":"qa-a90da023e722","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02edf7f1-c9aa-4ea4-8ee6-fe1cc1b99799
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-02edf7f1-c9aa-4ea4-8ee6-fe1cc1b99799"}
```
