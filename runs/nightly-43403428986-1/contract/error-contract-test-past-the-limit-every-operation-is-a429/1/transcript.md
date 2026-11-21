# Transcript: Past its rate limit, a token gets a 429 problem from every operation

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#pastTheLimitEveryOperationIsA429` |
| Features | FEAT-RATE-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 102 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-3a496648-6da7-4a9e-8ba3-ec83ed0cf1ad` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-9e813727-4b7b-4870-be11-499d9e6a22eb` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-e3473bb7-cf29-4b2a-ab0b-7d2acc21a088` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-b8f5db34-42f4-4219-a3eb-2c4d10e03807` |
| 5 | `GET /v1/accounts/me` | 200 | 22 | `qa-e92982df-e75b-4470-b63b-e82cbda6ef8b` |
| 6 | `GET /v1/accounts/me` | 200 | 27 | `qa-38ffed1e-a3f7-4cf9-9f3b-c2718003997c` |
| 7 | `GET /v1/accounts/me` | 200 | 28 | `qa-4a92f810-3dc5-4560-bdf3-6860df84c3f2` |
| 8 | `GET /v1/accounts/me` | 200 | 19 | `qa-a9dc173b-eb32-4498-a34f-0e7e9ed38e70` |
| 9 | `GET /v1/accounts/me` | 200 | 16 | `qa-12d81742-9006-4456-86e7-a19e37a5b2f7` |
| 10 | `GET /v1/accounts/me` | 200 | 18 | `qa-d5cdddaf-fec9-4b04-a0c6-1bbf188adb56` |
| 11 | `GET /v1/accounts/me` | 200 | 18 | `qa-153b0e09-087c-4291-af5a-ea9be9c32198` |
| 12 | `GET /v1/accounts/me` | 200 | 23 | `qa-ff02315d-aa19-4abd-9882-9aaf7089ab0f` |
| 13 | `GET /v1/accounts/me` | 200 | 19 | `qa-884b5863-de1d-42bb-ad3e-8b7a7fe2b890` |
| 14 | `GET /v1/accounts/me` | 200 | 10 | `qa-c85d2f8b-967c-4685-b597-23882e00bb05` |
| 15 | `GET /v1/accounts/me` | 200 | 21 | `qa-ded144c8-dd5a-4103-bf01-ecaffca68168` |
| 16 | `GET /v1/accounts/me` | 200 | 17 | `qa-a72d01a0-6aaa-495d-8e07-a5977d743242` |
| 17 | `GET /v1/accounts/me` | 200 | 11 | `qa-c3249252-d41e-4d5f-8308-6fd9097ba263` |
| 18 | `GET /v1/accounts/me` | 200 | 12 | `qa-b87002fb-d93a-4592-9948-7bc9e65042e4` |
| 19 | `GET /v1/accounts/me` | 200 | 18 | `qa-d0c9bade-a3de-4bb7-b524-e9b669659962` |
| 20 | `GET /v1/accounts/me` | 200 | 36 | `qa-195ad74a-dbfd-42dc-9dcd-dbdaa9a58f53` |
| 21 | `GET /v1/accounts/me` | 200 | 27 | `qa-f717995a-e70a-4e6d-a7a9-c3010681c0d7` |
| 22 | `GET /v1/accounts/me` | 200 | 8 | `qa-530f83b4-0bb1-4e62-898a-9bfe7c43512b` |
| 23 | `GET /v1/accounts/me` | 200 | 10 | `qa-298292d3-c8d9-4ae2-94f4-c4c40ed3f9cf` |
| 24 | `GET /v1/accounts/me` | 200 | 8 | `qa-f483c811-d191-479d-989a-35d3b1eb7118` |
| 25 | `GET /v1/accounts/me` | 200 | 15 | `qa-a8f74741-01fd-412c-bf17-edfcbc954732` |
| 26 | `GET /v1/accounts/me` | 200 | 11 | `qa-a847eb14-5b60-4c2e-a5ca-f22437789172` |
| 27 | `GET /v1/accounts/me` | 200 | 10 | `qa-3045fe35-b9cf-48b8-af0a-7218f079db2f` |
| 28 | `GET /v1/accounts/me` | 200 | 10 | `qa-481257cd-939b-466a-8f19-3069b900bd33` |
| 29 | `GET /v1/accounts/me` | 200 | 9 | `qa-7bae623f-3901-4d98-9339-e4ebbfaf62bf` |
| 30 | `GET /v1/accounts/me` | 200 | 8 | `qa-e0f1e02e-569f-410c-b733-b0beedaa8f22` |
| 31 | `GET /v1/accounts/me` | 200 | 9 | `qa-745cc395-69d4-4e11-86c4-4061e5703107` |
| 32 | `GET /v1/accounts/me` | 200 | 9 | `qa-03b2938a-253b-4587-bda9-2bbb14418eeb` |
| 33 | `GET /v1/accounts/me` | 200 | 58 | `qa-bf135e47-1103-458a-8de7-d514e147d74b` |
| 34 | `GET /v1/accounts/me` | 200 | 18 | `qa-6c99681a-1862-43c7-8faf-e5de281bd4b1` |
| 35 | `GET /v1/accounts/me` | 200 | 20 | `qa-819160cb-b378-4cb2-91fb-0f5169ced56b` |
| 36 | `GET /v1/accounts/me` | 200 | 25 | `qa-1c56baf7-847c-490a-895f-353facccefb3` |
| 37 | `GET /v1/accounts/me` | 200 | 12 | `qa-04a1a3f6-c80f-4857-b7c1-7b6dc5d55981` |
| 38 | `GET /v1/accounts/me` | 200 | 19 | `qa-0a61b53a-9975-422a-85d7-5e35796b5be4` |
| 39 | `GET /v1/accounts/me` | 200 | 19 | `qa-d844f66d-b628-482c-9d1f-a834f9abb13a` |
| 40 | `GET /v1/accounts/me` | 200 | 11 | `qa-43513c37-9d21-4351-a776-714665fce32f` |
| 41 | `GET /v1/accounts/me` | 200 | 18 | `qa-7218a3d8-7133-4652-af21-90a5c4f5e3ab` |
| 42 | `GET /v1/accounts/me` | 200 | 12 | `qa-05b82933-abd0-429c-a071-ef52a9b21d55` |
| 43 | `GET /v1/accounts/me` | 200 | 5 | `qa-ffae17cf-45a4-4d47-a02d-acfcdaf141f8` |
| 44 | `GET /v1/accounts/me` | 200 | 24 | `qa-5d3063e0-6840-4e0f-91b6-4e2254b2cdf6` |
| 45 | `GET /v1/accounts/me` | 200 | 16 | `qa-e7df9ddf-50ce-46f3-86d7-a2f42ef6ca1d` |
| 46 | `GET /v1/accounts/me` | 200 | 8 | `qa-c474d90e-e007-45a2-a6fd-c15269cd8b7b` |
| 47 | `GET /v1/accounts/me` | 200 | 10 | `qa-6d51fd20-f516-476c-84b1-7957bc344aec` |
| 48 | `GET /v1/accounts/me` | 200 | 5 | `qa-f8347b62-5949-4780-bba3-65293d31ef2c` |
| 49 | `GET /v1/accounts/me` | 200 | 12 | `qa-848c3c65-2d7b-46ee-8cdc-f0ecce40b97a` |
| 50 | `GET /v1/accounts/me` | 200 | 10 | `qa-e98ab4c4-efc4-436f-93a4-46e7e6102610` |
| 51 | `GET /v1/accounts/me` | 200 | 11 | `qa-97e224b1-a0ca-42b1-b2f4-ab9b7635e0df` |
| 52 | `GET /v1/accounts/me` | 200 | 5 | `qa-b47acac2-bd28-4fb3-a5df-f1582508a235` |
| 53 | `GET /v1/accounts/me` | 200 | 9 | `qa-72c36ec8-184f-4f75-be3c-17dc3a51de83` |
| 54 | `GET /v1/accounts/me` | 200 | 8 | `qa-d4144936-3d57-4239-b6d0-6bd0e60b2622` |
| 55 | `GET /v1/accounts/me` | 200 | 9 | `qa-17e2303e-1c4c-4aa6-a254-73d89e8348fb` |
| 56 | `GET /v1/accounts/me` | 200 | 12 | `qa-493eecc1-405a-4718-80d3-f0043f24e585` |
| 57 | `GET /v1/accounts/me` | 200 | 10 | `qa-3c6c6b18-fc59-4af5-b557-d3906d052541` |
| 58 | `GET /v1/accounts/me` | 200 | 13 | `qa-0ebc0a05-1d30-4f8d-9b41-3a1f226d25c4` |
| 59 | `GET /v1/accounts/me` | 200 | 8 | `qa-af1d9381-4397-4c05-8aaf-fb9d8d182ed2` |
| 60 | `GET /v1/accounts/me` | 200 | 17 | `qa-86d98505-51f9-4233-b0cb-13aa0eb9d27d` |
| 61 | `GET /v1/accounts/me` | 200 | 12 | `qa-1bc8e658-1c37-4a53-9a4a-e31f3bcb75f3` |
| 62 | `GET /v1/accounts/me` | 200 | 9 | `qa-745f8f42-3a31-4d3e-93db-7852bf27c34c` |
| 63 | `GET /v1/accounts/me` | 200 | 11 | `qa-e0f3bc79-6a96-4825-b966-0166eb7287ce` |
| 64 | `GET /v1/accounts/me` | 429 | 15 | `qa-cc40c903-9bdb-4f95-adb0-37dbcd70c83d` |
| 65 | `POST /v1/auth/token` | 429 | 13 | `qa-68684928-cba2-4c0b-9abf-8439a854d7e8` |
| 66 | `POST /v1/accounts` | 429 | 4 | `qa-7648a5da-34e2-4617-801d-1623e1c5afdf` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-406df57e-3d88-4a0b-8c89-5779f29b2fc5` |
| 68 | `PATCH /v1/accounts/me` | 429 | 5 | `qa-39c25c60-9606-440c-b71f-b24d44e68f0c` |
| 69 | `DELETE /v1/accounts/me` | 429 | 4 | `qa-b2e59803-86f0-4d36-b5f7-5ebe70d3c697` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 4 | `qa-59c95ac8-0c86-4b24-a5c1-4acac78faf17` |
| 71 | `POST /v1/conversations` | 429 | 5 | `qa-54d6cfbc-d2c7-42cb-9b69-ec8357e55baf` |
| 72 | `GET /v1/conversations` | 429 | 4 | `qa-4168bb51-2d34-4fe3-a618-407f8a28160f` |
| 73 | `GET /v1/conversations/{id}` | 429 | 4 | `qa-2770ae73-f55a-495f-b4de-c46e6904878b` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 9 | `qa-fba0579c-88dc-4577-b60f-9e90464d2a48` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 15 | `qa-007e6acf-404f-4dc4-b655-ed9101caf38b` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 5 | `qa-6cfdbc90-aaec-4e79-ab22-fe0fd35ff48c` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 5 | `qa-7bcabc93-e325-4657-ae8b-4c3c99b0d98a` |
| 78 | `GET /v1/credits/balance` | 429 | 7 | `qa-b9de6d40-f97c-4450-907d-647284c10603` |
| 79 | `GET /v1/credits/ledger` | 429 | 6 | `qa-7c44072c-4b9d-4b32-91d5-defcabbe28e8` |
| 80 | `POST /v1/credits/purchases` | 429 | 4 | `qa-61731c98-cb0d-4c48-b785-e4d6b76e4d6b` |
| 81 | `GET /v1/admin/stats` | 429 | 4 | `qa-c820645c-b54b-49d8-bc7a-7e591ebe8635` |
| 82 | `GET /v1/accounts/me` | 429 | 4 | `qa-86ef0bef-0489-4e64-9714-52d2588f086a` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-7a73fb2e-aeef-44fb-bd9b-378a1880d57e` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-f758749c-4d6d-43c6-b55b-a748e9e054d1` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-5f77dadb-c847-4f13-9a3b-3198a900e49e` |
| 86 | `GET /v1/accounts/me` | 429 | 4 | `qa-efc194d5-cc7a-4266-b80c-04ec3daf8451` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-9d06feab-3e54-44be-9a66-b0ee7cf01ded` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-9e2f0758-3843-4f31-9f49-6cadd541c5c1` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-17a5f81d-99a7-4169-a30d-bf0b0c49ae5b` |
| 90 | `GET /v1/accounts/me` | 429 | 4 | `qa-979308dc-2ab9-4c98-a2e2-07363f5df26e` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-60c71e72-a80c-44c1-832c-732ef4707561` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-9b632dfe-aa78-4260-ac4d-ba8c5a321f11` |
| 93 | `GET /v1/accounts/me` | 429 | 3 | `qa-ab1e928d-0ad9-4cbb-874c-1ed130adca5c` |
| 94 | `GET /v1/accounts/me` | 429 | 3 | `qa-9380b372-b1e1-4e17-9fc8-7b8c15e04f3f` |
| 95 | `GET /v1/accounts/me` | 429 | 3 | `qa-26ac844b-a9ec-4628-9782-5b3db7d8ab09` |
| 96 | `GET /v1/accounts/me` | 429 | 3 | `qa-5e47cf70-50ae-4342-be3a-ebc08c0e845b` |
| 97 | `GET /v1/accounts/me` | 200 | 3 | `qa-aa311a42-b2cc-4366-a770-e2dc065e8f4f` |
| 98 | `POST /v1/auth/token` | 200 | 8 | `qa-c94207e1-1f31-4615-b548-c00af67769f8` |
| 99 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-e56824c6-414e-4fed-abc3-9356ef414f01` |
| 100 | `POST /v1/auth/token` | 401 | 3 | `qa-b0406d2d-18b6-4b82-b260-a905f9cc0d1f` |
| 101 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-05a381b6-c565-4c51-b80b-2ebb975a38e4` |
| 102 | `POST /v1/auth/token` | 401 | 7 | `qa-8805b710-9d2e-4706-96a3-34798b85195c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3a496648-6da7-4a9e-8ba3-ec83ed0cf1ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a496648-6da7-4a9e-8ba3-ec83ed0cf1ad
Content-Type: application/json

--- request body ---
{"handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a496648-6da7-4a9e-8ba3-ec83ed0cf1ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 8
Location: /v1/accounts/qa-8dc4fcc5987b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9e813727-4b7b-4870-be11-499d9e6a22eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e813727-4b7b-4870-be11-499d9e6a22eb
Content-Type: application/json

--- request body ---
{"handle":"qa-30d7084d6228","displayName":"QA 30d7084d6228","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e813727-4b7b-4870-be11-499d9e6a22eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 8
Location: /v1/accounts/qa-30d7084d6228
X-Served-Region: eu
Content-Length: 181

{"id":"acc_79f61be6-6d10-441f-a381-87af3e949c2c","handle":"qa-30d7084d6228","displayName":"QA 30d7084d6228","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.331491234Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e3473bb7-cf29-4b2a-ab0b-7d2acc21a088

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3473bb7-cf29-4b2a-ab0b-7d2acc21a088
Content-Type: application/json

--- request body ---
{"handle":"qa-8dc4fcc5987b","password":"****"}

--- response: 200 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3473bb7-cf29-4b2a-ab0b-7d2acc21a088
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b8f5db34-42f4-4219-a3eb-2c4d10e03807

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8f5db34-42f4-4219-a3eb-2c4d10e03807
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-30d7084d6228","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8f5db34-42f4-4219-a3eb-2c4d10e03807
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
Location: /v1/conversations/cnv_6442ec6f-0373-4723-beb9-7b8b53e4c640
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6442ec6f-0373-4723-beb9-7b8b53e4c640","subject":"Error contract","status":"open","region":"eu","participants":["qa-8dc4fcc5987b","qa-30d7084d6228"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.382765753Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-e92982df-e75b-4470-b63b-e82cbda6ef8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e92982df-e75b-4470-b63b-e82cbda6ef8b
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e92982df-e75b-4470-b63b-e82cbda6ef8b
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-38ffed1e-a3f7-4cf9-9f3b-c2718003997c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38ffed1e-a3f7-4cf9-9f3b-c2718003997c
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-38ffed1e-a3f7-4cf9-9f3b-c2718003997c
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-4a92f810-3dc5-4560-bdf3-6860df84c3f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a92f810-3dc5-4560-bdf3-6860df84c3f2
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a92f810-3dc5-4560-bdf3-6860df84c3f2
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-a9dc173b-eb32-4498-a34f-0e7e9ed38e70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9dc173b-eb32-4498-a34f-0e7e9ed38e70
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9dc173b-eb32-4498-a34f-0e7e9ed38e70
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-12d81742-9006-4456-86e7-a19e37a5b2f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12d81742-9006-4456-86e7-a19e37a5b2f7
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-12d81742-9006-4456-86e7-a19e37a5b2f7
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5cdddaf-fec9-4b04-a0c6-1bbf188adb56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5cdddaf-fec9-4b04-a0c6-1bbf188adb56
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5cdddaf-fec9-4b04-a0c6-1bbf188adb56
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-153b0e09-087c-4291-af5a-ea9be9c32198

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-153b0e09-087c-4291-af5a-ea9be9c32198
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-153b0e09-087c-4291-af5a-ea9be9c32198
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-ff02315d-aa19-4abd-9882-9aaf7089ab0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff02315d-aa19-4abd-9882-9aaf7089ab0f
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff02315d-aa19-4abd-9882-9aaf7089ab0f
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-884b5863-de1d-42bb-ad3e-8b7a7fe2b890

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-884b5863-de1d-42bb-ad3e-8b7a7fe2b890
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-884b5863-de1d-42bb-ad3e-8b7a7fe2b890
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-c85d2f8b-967c-4685-b597-23882e00bb05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c85d2f8b-967c-4685-b597-23882e00bb05
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-c85d2f8b-967c-4685-b597-23882e00bb05
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-ded144c8-dd5a-4103-bf01-ecaffca68168

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ded144c8-dd5a-4103-bf01-ecaffca68168
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ded144c8-dd5a-4103-bf01-ecaffca68168
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-a72d01a0-6aaa-495d-8e07-a5977d743242

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a72d01a0-6aaa-495d-8e07-a5977d743242
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-a72d01a0-6aaa-495d-8e07-a5977d743242
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3249252-d41e-4d5f-8308-6fd9097ba263

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3249252-d41e-4d5f-8308-6fd9097ba263
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3249252-d41e-4d5f-8308-6fd9097ba263
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-b87002fb-d93a-4592-9948-7bc9e65042e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b87002fb-d93a-4592-9948-7bc9e65042e4
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b87002fb-d93a-4592-9948-7bc9e65042e4
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-d0c9bade-a3de-4bb7-b524-e9b669659962

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0c9bade-a3de-4bb7-b524-e9b669659962
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0c9bade-a3de-4bb7-b524-e9b669659962
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-195ad74a-dbfd-42dc-9dcd-dbdaa9a58f53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-195ad74a-dbfd-42dc-9dcd-dbdaa9a58f53
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-195ad74a-dbfd-42dc-9dcd-dbdaa9a58f53
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-f717995a-e70a-4e6d-a7a9-c3010681c0d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f717995a-e70a-4e6d-a7a9-c3010681c0d7
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-f717995a-e70a-4e6d-a7a9-c3010681c0d7
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-530f83b4-0bb1-4e62-898a-9bfe7c43512b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-530f83b4-0bb1-4e62-898a-9bfe7c43512b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-530f83b4-0bb1-4e62-898a-9bfe7c43512b
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-298292d3-c8d9-4ae2-94f4-c4c40ed3f9cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-298292d3-c8d9-4ae2-94f4-c4c40ed3f9cf
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-298292d3-c8d9-4ae2-94f4-c4c40ed3f9cf
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-f483c811-d191-479d-989a-35d3b1eb7118

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f483c811-d191-479d-989a-35d3b1eb7118
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-f483c811-d191-479d-989a-35d3b1eb7118
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-a8f74741-01fd-412c-bf17-edfcbc954732

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8f74741-01fd-412c-bf17-edfcbc954732
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8f74741-01fd-412c-bf17-edfcbc954732
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-a847eb14-5b60-4c2e-a5ca-f22437789172

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a847eb14-5b60-4c2e-a5ca-f22437789172
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-a847eb14-5b60-4c2e-a5ca-f22437789172
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-3045fe35-b9cf-48b8-af0a-7218f079db2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3045fe35-b9cf-48b8-af0a-7218f079db2f
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3045fe35-b9cf-48b8-af0a-7218f079db2f
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-481257cd-939b-466a-8f19-3069b900bd33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-481257cd-939b-466a-8f19-3069b900bd33
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-481257cd-939b-466a-8f19-3069b900bd33
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-7bae623f-3901-4d98-9339-e4ebbfaf62bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bae623f-3901-4d98-9339-e4ebbfaf62bf
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-7bae623f-3901-4d98-9339-e4ebbfaf62bf
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0f1e02e-569f-410c-b733-b0beedaa8f22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0f1e02e-569f-410c-b733-b0beedaa8f22
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0f1e02e-569f-410c-b733-b0beedaa8f22
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-745cc395-69d4-4e11-86c4-4061e5703107

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-745cc395-69d4-4e11-86c4-4061e5703107
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-745cc395-69d4-4e11-86c4-4061e5703107
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-03b2938a-253b-4587-bda9-2bbb14418eeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03b2938a-253b-4587-bda9-2bbb14418eeb
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-03b2938a-253b-4587-bda9-2bbb14418eeb
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf135e47-1103-458a-8de7-d514e147d74b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf135e47-1103-458a-8de7-d514e147d74b
Content-Type: application/json

--- response: 200 in 58 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf135e47-1103-458a-8de7-d514e147d74b
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-6c99681a-1862-43c7-8faf-e5de281bd4b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c99681a-1862-43c7-8faf-e5de281bd4b1
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c99681a-1862-43c7-8faf-e5de281bd4b1
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-819160cb-b378-4cb2-91fb-0f5169ced56b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-819160cb-b378-4cb2-91fb-0f5169ced56b
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-819160cb-b378-4cb2-91fb-0f5169ced56b
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-1c56baf7-847c-490a-895f-353facccefb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c56baf7-847c-490a-895f-353facccefb3
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c56baf7-847c-490a-895f-353facccefb3
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-04a1a3f6-c80f-4857-b7c1-7b6dc5d55981

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04a1a3f6-c80f-4857-b7c1-7b6dc5d55981
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-04a1a3f6-c80f-4857-b7c1-7b6dc5d55981
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-0a61b53a-9975-422a-85d7-5e35796b5be4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a61b53a-9975-422a-85d7-5e35796b5be4
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a61b53a-9975-422a-85d7-5e35796b5be4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-d844f66d-b628-482c-9d1f-a834f9abb13a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d844f66d-b628-482c-9d1f-a834f9abb13a
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-d844f66d-b628-482c-9d1f-a834f9abb13a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-43513c37-9d21-4351-a776-714665fce32f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43513c37-9d21-4351-a776-714665fce32f
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-43513c37-9d21-4351-a776-714665fce32f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-7218a3d8-7133-4652-af21-90a5c4f5e3ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7218a3d8-7133-4652-af21-90a5c4f5e3ab
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-7218a3d8-7133-4652-af21-90a5c4f5e3ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-05b82933-abd0-429c-a071-ef52a9b21d55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05b82933-abd0-429c-a071-ef52a9b21d55
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-05b82933-abd0-429c-a071-ef52a9b21d55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-ffae17cf-45a4-4d47-a02d-acfcdaf141f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffae17cf-45a4-4d47-a02d-acfcdaf141f8
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffae17cf-45a4-4d47-a02d-acfcdaf141f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d3063e0-6840-4e0f-91b6-4e2254b2cdf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d3063e0-6840-4e0f-91b6-4e2254b2cdf6
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d3063e0-6840-4e0f-91b6-4e2254b2cdf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7df9ddf-50ce-46f3-86d7-a2f42ef6ca1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7df9ddf-50ce-46f3-86d7-a2f42ef6ca1d
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7df9ddf-50ce-46f3-86d7-a2f42ef6ca1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-c474d90e-e007-45a2-a6fd-c15269cd8b7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c474d90e-e007-45a2-a6fd-c15269cd8b7b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-c474d90e-e007-45a2-a6fd-c15269cd8b7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-6d51fd20-f516-476c-84b1-7957bc344aec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d51fd20-f516-476c-84b1-7957bc344aec
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d51fd20-f516-476c-84b1-7957bc344aec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-f8347b62-5949-4780-bba3-65293d31ef2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8347b62-5949-4780-bba3-65293d31ef2c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8347b62-5949-4780-bba3-65293d31ef2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-848c3c65-2d7b-46ee-8cdc-f0ecce40b97a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-848c3c65-2d7b-46ee-8cdc-f0ecce40b97a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-848c3c65-2d7b-46ee-8cdc-f0ecce40b97a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-e98ab4c4-efc4-436f-93a4-46e7e6102610

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e98ab4c4-efc4-436f-93a4-46e7e6102610
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-e98ab4c4-efc4-436f-93a4-46e7e6102610
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-97e224b1-a0ca-42b1-b2f4-ab9b7635e0df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97e224b1-a0ca-42b1-b2f4-ab9b7635e0df
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-97e224b1-a0ca-42b1-b2f4-ab9b7635e0df
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-b47acac2-bd28-4fb3-a5df-f1582508a235

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b47acac2-bd28-4fb3-a5df-f1582508a235
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-b47acac2-bd28-4fb3-a5df-f1582508a235
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-72c36ec8-184f-4f75-be3c-17dc3a51de83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72c36ec8-184f-4f75-be3c-17dc3a51de83
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-72c36ec8-184f-4f75-be3c-17dc3a51de83
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-d4144936-3d57-4239-b6d0-6bd0e60b2622

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4144936-3d57-4239-b6d0-6bd0e60b2622
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4144936-3d57-4239-b6d0-6bd0e60b2622
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-17e2303e-1c4c-4aa6-a254-73d89e8348fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17e2303e-1c4c-4aa6-a254-73d89e8348fb
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-17e2303e-1c4c-4aa6-a254-73d89e8348fb
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-493eecc1-405a-4718-80d3-f0043f24e585

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-493eecc1-405a-4718-80d3-f0043f24e585
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-493eecc1-405a-4718-80d3-f0043f24e585
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-3c6c6b18-fc59-4af5-b557-d3906d052541

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c6c6b18-fc59-4af5-b557-d3906d052541
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c6c6b18-fc59-4af5-b557-d3906d052541
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ebc0a05-1d30-4f8d-9b41-3a1f226d25c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ebc0a05-1d30-4f8d-9b41-3a1f226d25c4
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ebc0a05-1d30-4f8d-9b41-3a1f226d25c4
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-af1d9381-4397-4c05-8aaf-fb9d8d182ed2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af1d9381-4397-4c05-8aaf-fb9d8d182ed2
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-af1d9381-4397-4c05-8aaf-fb9d8d182ed2
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-86d98505-51f9-4233-b0cb-13aa0eb9d27d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86d98505-51f9-4233-b0cb-13aa0eb9d27d
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-86d98505-51f9-4233-b0cb-13aa0eb9d27d
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-1bc8e658-1c37-4a53-9a4a-e31f3bcb75f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bc8e658-1c37-4a53-9a4a-e31f3bcb75f3
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bc8e658-1c37-4a53-9a4a-e31f3bcb75f3
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-745f8f42-3a31-4d3e-93db-7852bf27c34c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-745f8f42-3a31-4d3e-93db-7852bf27c34c
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-745f8f42-3a31-4d3e-93db-7852bf27c34c
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0f3bc79-6a96-4825-b966-0166eb7287ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0f3bc79-6a96-4825-b966-0166eb7287ce
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0f3bc79-6a96-4825-b966-0166eb7287ce
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc40c903-9bdb-4f95-adb0-37dbcd70c83d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc40c903-9bdb-4f95-adb0-37dbcd70c83d
Content-Type: application/json

--- response: 429 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc40c903-9bdb-4f95-adb0-37dbcd70c83d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cc40c903-9bdb-4f95-adb0-37dbcd70c83d"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-68684928-cba2-4c0b-9abf-8439a854d7e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68684928-cba2-4c0b-9abf-8439a854d7e8
Content-Type: application/json

--- request body ---
{"handle":"qa-8dc4fcc5987b","password":"****"}

--- response: 429 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68684928-cba2-4c0b-9abf-8439a854d7e8
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
Content-Length: 240

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-68684928-cba2-4c0b-9abf-8439a854d7e8"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-7648a5da-34e2-4617-801d-1623e1c5afdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7648a5da-34e2-4617-801d-1623e1c5afdf
Content-Type: application/json

--- request body ---
{"handle":"qa-4ff9cad532b0","displayName":"QA 4ff9cad532b0","password":"****","region":"eu"}

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7648a5da-34e2-4617-801d-1623e1c5afdf
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
Content-Length: 238

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-7648a5da-34e2-4617-801d-1623e1c5afdf"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-406df57e-3d88-4a0b-8c89-5779f29b2fc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-406df57e-3d88-4a0b-8c89-5779f29b2fc5
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-406df57e-3d88-4a0b-8c89-5779f29b2fc5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-406df57e-3d88-4a0b-8c89-5779f29b2fc5"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-39c25c60-9606-440c-b71f-b24d44e68f0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39c25c60-9606-440c-b71f-b24d44e68f0c
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39c25c60-9606-440c-b71f-b24d44e68f0c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-39c25c60-9606-440c-b71f-b24d44e68f0c"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b2e59803-86f0-4d36-b5f7-5ebe70d3c697

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2e59803-86f0-4d36-b5f7-5ebe70d3c697
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2e59803-86f0-4d36-b5f7-5ebe70d3c697
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b2e59803-86f0-4d36-b5f7-5ebe70d3c697"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-8dc4fcc5987b
correlation: qa-59c95ac8-0c86-4b24-a5c1-4acac78faf17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59c95ac8-0c86-4b24-a5c1-4acac78faf17
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59c95ac8-0c86-4b24-a5c1-4acac78faf17
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
Content-Length: 254

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-8dc4fcc5987b","correlationId":"qa-59c95ac8-0c86-4b24-a5c1-4acac78faf17"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-54d6cfbc-d2c7-42cb-9b69-ec8357e55baf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54d6cfbc-d2c7-42cb-9b69-ec8357e55baf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8dc4fcc5987b","subject":"Probe","message":"Hi"}

--- response: 429 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-54d6cfbc-d2c7-42cb-9b69-ec8357e55baf
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
Content-Length: 243

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-54d6cfbc-d2c7-42cb-9b69-ec8357e55baf"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-4168bb51-2d34-4fe3-a618-407f8a28160f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4168bb51-2d34-4fe3-a618-407f8a28160f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4168bb51-2d34-4fe3-a618-407f8a28160f
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
Content-Length: 243

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-4168bb51-2d34-4fe3-a618-407f8a28160f"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_6442ec6f-0373-4723-beb9-7b8b53e4c640
correlation: qa-2770ae73-f55a-495f-b4de-c46e6904878b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2770ae73-f55a-495f-b4de-c46e6904878b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2770ae73-f55a-495f-b4de-c46e6904878b
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
Content-Length: 284

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_6442ec6f-0373-4723-beb9-7b8b53e4c640","correlationId":"qa-2770ae73-f55a-495f-b4de-c46e6904878b"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_6442ec6f-0373-4723-beb9-7b8b53e4c640/messages
correlation: qa-fba0579c-88dc-4577-b60f-9e90464d2a48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fba0579c-88dc-4577-b60f-9e90464d2a48
Content-Type: application/json

--- response: 429 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fba0579c-88dc-4577-b60f-9e90464d2a48
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
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_6442ec6f-0373-4723-beb9-7b8b53e4c640/messages","correlationId":"qa-fba0579c-88dc-4577-b60f-9e90464d2a48"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_6442ec6f-0373-4723-beb9-7b8b53e4c640/messages
correlation: qa-007e6acf-404f-4dc4-b655-ed9101caf38b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-007e6acf-404f-4dc4-b655-ed9101caf38b
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-007e6acf-404f-4dc4-b655-ed9101caf38b
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
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_6442ec6f-0373-4723-beb9-7b8b53e4c640/messages","correlationId":"qa-007e6acf-404f-4dc4-b655-ed9101caf38b"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_6442ec6f-0373-4723-beb9-7b8b53e4c640/read
correlation: qa-6cfdbc90-aaec-4e79-ab22-fe0fd35ff48c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cfdbc90-aaec-4e79-ab22-fe0fd35ff48c
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6cfdbc90-aaec-4e79-ab22-fe0fd35ff48c
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
Content-Length: 289

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_6442ec6f-0373-4723-beb9-7b8b53e4c640/read","correlationId":"qa-6cfdbc90-aaec-4e79-ab22-fe0fd35ff48c"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_6442ec6f-0373-4723-beb9-7b8b53e4c640/close
correlation: qa-7bcabc93-e325-4657-ae8b-4c3c99b0d98a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bcabc93-e325-4657-ae8b-4c3c99b0d98a
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7bcabc93-e325-4657-ae8b-4c3c99b0d98a
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
Content-Length: 290

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_6442ec6f-0373-4723-beb9-7b8b53e4c640/close","correlationId":"qa-7bcabc93-e325-4657-ae8b-4c3c99b0d98a"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-b9de6d40-f97c-4450-907d-647284c10603

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9de6d40-f97c-4450-907d-647284c10603
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b9de6d40-f97c-4450-907d-647284c10603
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
Content-Length: 245

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-b9de6d40-f97c-4450-907d-647284c10603"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-7c44072c-4b9d-4b32-91d5-defcabbe28e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c44072c-4b9d-4b32-91d5-defcabbe28e8
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c44072c-4b9d-4b32-91d5-defcabbe28e8
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
Content-Length: 244

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-7c44072c-4b9d-4b32-91d5-defcabbe28e8"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-61731c98-cb0d-4c48-b785-e4d6b76e4d6b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f1378a956fca4d29bb4e303cd429c0ee
X-Correlation-Id: qa-61731c98-cb0d-4c48-b785-e4d6b76e4d6b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61731c98-cb0d-4c48-b785-e4d6b76e4d6b
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
Content-Length: 247

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-61731c98-cb0d-4c48-b785-e4d6b76e4d6b"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-c820645c-b54b-49d8-bc7a-7e591ebe8635

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c820645c-b54b-49d8-bc7a-7e591ebe8635
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c820645c-b54b-49d8-bc7a-7e591ebe8635
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-c820645c-b54b-49d8-bc7a-7e591ebe8635"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-86ef0bef-0489-4e64-9714-52d2588f086a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86ef0bef-0489-4e64-9714-52d2588f086a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-86ef0bef-0489-4e64-9714-52d2588f086a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-86ef0bef-0489-4e64-9714-52d2588f086a"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-7a73fb2e-aeef-44fb-bd9b-378a1880d57e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a73fb2e-aeef-44fb-bd9b-378a1880d57e
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a73fb2e-aeef-44fb-bd9b-378a1880d57e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7a73fb2e-aeef-44fb-bd9b-378a1880d57e"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-f758749c-4d6d-43c6-b55b-a748e9e054d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f758749c-4d6d-43c6-b55b-a748e9e054d1
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f758749c-4d6d-43c6-b55b-a748e9e054d1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f758749c-4d6d-43c6-b55b-a748e9e054d1"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f77dadb-c847-4f13-9a3b-3198a900e49e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f77dadb-c847-4f13-9a3b-3198a900e49e
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f77dadb-c847-4f13-9a3b-3198a900e49e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5f77dadb-c847-4f13-9a3b-3198a900e49e"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-efc194d5-cc7a-4266-b80c-04ec3daf8451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efc194d5-cc7a-4266-b80c-04ec3daf8451
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-efc194d5-cc7a-4266-b80c-04ec3daf8451
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-efc194d5-cc7a-4266-b80c-04ec3daf8451"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-9d06feab-3e54-44be-9a66-b0ee7cf01ded

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d06feab-3e54-44be-9a66-b0ee7cf01ded
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d06feab-3e54-44be-9a66-b0ee7cf01ded
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9d06feab-3e54-44be-9a66-b0ee7cf01ded"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-9e2f0758-3843-4f31-9f49-6cadd541c5c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e2f0758-3843-4f31-9f49-6cadd541c5c1
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9e2f0758-3843-4f31-9f49-6cadd541c5c1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9e2f0758-3843-4f31-9f49-6cadd541c5c1"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-17a5f81d-99a7-4169-a30d-bf0b0c49ae5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17a5f81d-99a7-4169-a30d-bf0b0c49ae5b
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-17a5f81d-99a7-4169-a30d-bf0b0c49ae5b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-17a5f81d-99a7-4169-a30d-bf0b0c49ae5b"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-979308dc-2ab9-4c98-a2e2-07363f5df26e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-979308dc-2ab9-4c98-a2e2-07363f5df26e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-979308dc-2ab9-4c98-a2e2-07363f5df26e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-979308dc-2ab9-4c98-a2e2-07363f5df26e"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-60c71e72-a80c-44c1-832c-732ef4707561

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60c71e72-a80c-44c1-832c-732ef4707561
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 13 Nov 2026 09:42:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60c71e72-a80c-44c1-832c-732ef4707561
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-60c71e72-a80c-44c1-832c-732ef4707561"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b632dfe-aa78-4260-ac4d-ba8c5a321f11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b632dfe-aa78-4260-ac4d-ba8c5a321f11
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b632dfe-aa78-4260-ac4d-ba8c5a321f11
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9b632dfe-aa78-4260-ac4d-ba8c5a321f11"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-ab1e928d-0ad9-4cbb-874c-1ed130adca5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab1e928d-0ad9-4cbb-874c-1ed130adca5c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 13 Nov 2026 09:42:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab1e928d-0ad9-4cbb-874c-1ed130adca5c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ab1e928d-0ad9-4cbb-874c-1ed130adca5c"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-9380b372-b1e1-4e17-9fc8-7b8c15e04f3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9380b372-b1e1-4e17-9fc8-7b8c15e04f3f
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 13 Nov 2026 09:42:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9380b372-b1e1-4e17-9fc8-7b8c15e04f3f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9380b372-b1e1-4e17-9fc8-7b8c15e04f3f"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-26ac844b-a9ec-4628-9782-5b3db7d8ab09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26ac844b-a9ec-4628-9782-5b3db7d8ab09
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 13 Nov 2026 09:42:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26ac844b-a9ec-4628-9782-5b3db7d8ab09
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-26ac844b-a9ec-4628-9782-5b3db7d8ab09"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-5e47cf70-50ae-4342-be3a-ebc08c0e845b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e47cf70-50ae-4342-be3a-ebc08c0e845b
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 13 Nov 2026 09:42:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e47cf70-50ae-4342-be3a-ebc08c0e845b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5e47cf70-50ae-4342-be3a-ebc08c0e845b"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-aa311a42-b2cc-4366-a770-e2dc065e8f4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa311a42-b2cc-4366-a770-e2dc065e8f4f
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Fri, 13 Nov 2026 09:42:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa311a42-b2cc-4366-a770-e2dc065e8f4f
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

{"id":"acc_e9aa31b3-d2ce-4d09-ab29-99055b915b14","handle":"qa-8dc4fcc5987b","displayName":"QA 8dc4fcc5987b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.287337153Z"}
```

## 98. POST /v1/auth/token

```text
#98 POST http://localhost:7070/v1/auth/token
correlation: qa-c94207e1-1f31-4615-b548-c00af67769f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c94207e1-1f31-4615-b548-c00af67769f8
Content-Type: application/json

--- request body ---
{"handle":"qa-30d7084d6228","password":"****"}

--- response: 200 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-c94207e1-1f31-4615-b548-c00af67769f8
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79f61be6-6d10-441f-a381-87af3e949c2c"}
```

## 99. DELETE /v1/accounts/me

```text
#99 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e56824c6-414e-4fed-abc3-9356ef414f01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e56824c6-414e-4fed-abc3-9356ef414f01
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Fri, 13 Nov 2026 09:42:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e56824c6-414e-4fed-abc3-9356ef414f01
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

## 100. POST /v1/auth/token

```text
#100 POST http://localhost:7070/v1/auth/token
correlation: qa-b0406d2d-18b6-4b82-b260-a905f9cc0d1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0406d2d-18b6-4b82-b260-a905f9cc0d1f
Content-Type: application/json

--- request body ---
{"handle":"qa-30d7084d6228","password":"****"}

--- response: 401 in 3 ms ---
Date: Fri, 13 Nov 2026 09:42:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0406d2d-18b6-4b82-b260-a905f9cc0d1f
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b0406d2d-18b6-4b82-b260-a905f9cc0d1f"}
```

## 101. DELETE /v1/accounts/me

```text
#101 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-05a381b6-c565-4c51-b80b-2ebb975a38e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05a381b6-c565-4c51-b80b-2ebb975a38e4
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-05a381b6-c565-4c51-b80b-2ebb975a38e4
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

## 102. POST /v1/auth/token

```text
#102 POST http://localhost:7070/v1/auth/token
correlation: qa-8805b710-9d2e-4706-96a3-34798b85195c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8805b710-9d2e-4706-96a3-34798b85195c
Content-Type: application/json

--- request body ---
{"handle":"qa-8dc4fcc5987b","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8805b710-9d2e-4706-96a3-34798b85195c
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8805b710-9d2e-4706-96a3-34798b85195c"}
```
